def generate_employee_evaluation(name, job_title, performance_score, areas_of_improvement):
    """
    Generate an employee evaluation report.

    Args:
        name (str): The name of the employee.
        job_title (str): The job title of the employee.
        performance_score (float): The performance score of the employee.
        areas_of_improvement (list): A list of areas of improvement for the employee.

    Returns:
        str: The employee evaluation report.
    """
    evaluation = f"""
    Employee Name: {name}
    Job Title: {job_title}
    Performance Score: {performance_score}

    Areas of Improvement:
    """
    for area in areas_of_improvement:
        evaluation += f"\n- {area}"
    
    return evaluation

def main():
    evaluation_report = generate_employee_evaluation(name, job_title, performance_score, areas_of_improvement)
    print(evaluation_report)

if __name__ == "__main__":
    main()
