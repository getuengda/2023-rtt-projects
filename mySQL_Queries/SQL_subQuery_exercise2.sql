select * 
from payments
where amount > 6000;

select * 
from payments
where amount > (select avg(amount) from payments)
order by amount desc;

-- the in statement can be used with a subquerry
select id from offices where city like '%0%';
select * 
from employees 
where office_id IN(1,2,3,5,7);

select * from employees where office_id IN(select id from offices where city like '%o%');

-- show the most 10 popular product
SELECT *
FROM products p, (
    SELECT p.id, SUM(od.quantity_ordered) AS total_ordered
    FROM products p, orderdetails od
    where od.product_id = p.id
    GROUP BY p.id
    ORDER BY total_ordered DESC
    LIMIT 10
) popular
where p.id = popular.id;

SELECT id, totalOrdered
FROM (
    SELECT p.id, SUM(od.quantity_ordered) AS totalOrdered
    FROM products p,orderdetails od
    where od.product_id = p.id
    GROUP BY p.id
    ORDER BY totalOrdered DESC
    LIMIT 10
) AS subquery;

-- Left JOIN
select c.customer_name, o.customer_id, o.status
From customers c
left join orders o on c.customer_name = o.customer_id;

select *
From employees;

-- Self Join
-- You can use the SELF JOIN to determine who reports to whom; to do so, we can use the INNER JOIN.
	SELECT m.id AS ManagerID, m.lastname AS Manager,  e.lastname AS 'employee', e.id AS EmployeeID
	FROM  employees e
	INNER JOIN employees m ON m.id = e.reports_to
	ORDER BY m.id;

-- Monday Home work
-- 1) I want to see a list of customer names and the order number for any orders that have made an order that has an order_date greater than the maximum payment date 
-- will require a sub query to get the max(payment_date) for the customer which can be used in the where clause to find orders with an order_date after the max(payment_date)
	-- customer_name, order_number, order_date(having > max(payment_date)),
	select c.customer_name, o.customer_id, o.order_date
	from customers c
	join orders o ON c.id = o.customer_id
	where o.order_date > (
		select MAX(payment_date)
		from payments p
		where p.customer_id = c.id
	);
    -- OR 
	select c.customer_name,o.id 
    from customers c,orders o 
    where c.id=o.customer_id 
	and o.order_date>(
		select max(p.payment_date)
        from payments p 
        where p.customer_id=o.customer_id
        );
    
-- 2) I want to see all the employees that are working in an office where the state is not null;
	select e.id, e.firstname, e.lastname, e.office_id, o.state
	from employees e 
	join offices o on e.office_id = o.id
	where o.state is not null;

-- 3) I want to all of the products that are not ground vehicles.   Hint -  where not in a select statement from product line
	select *
    from productlines;
    
    select product_code, product_name
    from products
    where productline_id in (
    select id
    from productlines
    where product_line in ('Planes','Ships'));
    
    select o.order_id, p.product_name 
    from products p, productlines ps, orderdetails o 
    where ps.id not in(1,2,5,6,7) 
		and ps.id=p.productline_id 
		and o.product_id=p.id;
    
-- 3a) I want to see a unique list of the order status
	select distinct status, count(*) 
    From orders
    group by id;

-- 4) use an IN statement with a sub query - I want to see the list of products that have been ordered but not yet shipped. - the orders table has a status column that contins the order status
	select *
    from orders;

	select p.product_name, p.productline_id, o.status
    from orders o, products p
    where status in ('In Process', 'On Hold')
    and p.productline_id IN (
		select od.product_id
		from orders o
		join orderdetails od ON od.order_id = o.id
	);
-- 5) The product name, and quantity ordered for all orders that are on holed or in process
	select * 
    from products;
    
    select * 
    from orders;
    
    select p.product_name, od.quantity_ordered
    from orders o, products p, orderdetails od
    where status = 'On Hold' or status = 'In Process'
    order by od.product_id;
    
-- 6) I want to see a list of all employess that do not have a customer!!!!  use a where not in ( select employee_id from customer where .... )
	select *
    from customers;
    
    select *
	From employees e
    where e.id not in (
		select c.sales_rep_employee_id 
        from customers c
        where c.sales_rep_employee_id=e.id
    );
    
-- 6a) I want to see the employee name and each of their customer names. IF the employee does not have any customers then show null for the customer name ... this is a left join
--    order this by the employee first name asc you will see the employee name repeated many times for each customer they have 
--   but if the employee has no customers it should print NULL in the second column.

	select e.id,e.firstname,e.lastname,c.customer_name
	from employees e 
    left join customers c on c.sales_rep_employee_id = e.id
	-- group by e.id,e.firstname,e.lastname,c.customer_name 
    order by e.id, e.firstname;
    
    -- without left join
    -- Employees who don't have any customers
    select * 
    from employees 
    where id not in (
    select  sales_rep_employee_id 
    from customers 
    where sales_rep_employee_id is not null
    );

