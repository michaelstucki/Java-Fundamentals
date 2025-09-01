-- 01: total number of employees
SELECT COUNT(emp_no) FROM employees;

-- 02: total number of departments
SELECT COUNT(dept_no) as number_departments FROM departments;

-- 03: total number of employees within each department
SELECT d.dept_no, COUNT(e.emp_no) AS num_employees
FROM employees e
JOIN dept_emp de
ON e.emp_no = de.emp_no
JOIN departments d
ON de.dept_no = d.dept_no
GROUP BY d.dept_no;

-- 04: the five employees who worked at the company the longest
SELECT e.emp_no, e.first_name, e.last_name, e.hire_date
FROM employees e
ORDER BY e.hire_date ASC
LIMIT 5;

-- 05: the ten newest employees
SELECT emp_no, first_name, last_name, hire_date
FROM employees
ORDER BY hire_date DESC
LIMIT 10;

-- 06: first name, last name, salary of the top 10 highest-paid employees
SELECT e.first_name, e.last_name, s.salary
FROM employees e
JOIN salaries s
ON e.emp_no = s.emp_no
ORDER BY s.salary DESC
LIMIT 10;

-- 07: first name, last name, salary of highest-paid manager
SELECT e.first_name, e.last_name, s.salary
FROM employees e
JOIN dept_manager dm
ON e.emp_no = dm.emp_no
JOIN salaries s
ON dm.emp_no
ORDER BY s.salary DESC
LIMIT 1;

-- 08: first name, last name, salary of lowest-paid manager
SELECT e.first_name, e.last_name, s.salary
FROM employees e
JOIN dept_manager dm
ON e.emp_no = dm.emp_no
JOIN salaries s
ON dm.emp_no
ORDER BY s.salary ASC
LIMIT 1;

-- 09: number of employees with a specific title, e.g., Engineer
SELECT COUNT(emp_no) AS num_engineers
FROM titles
WHERE title = "Engineer";


