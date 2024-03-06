# Code Refactoring with GitHub Copilot

## Introduction

GitHub code refactoring refers to the process of restructuring and improving the quality of code in a GitHub repository without changing its external behaviour. Code refactoring aims to enhance readability, maintainability, and performance while reducing technical debt and potential bugs.

In this exercise, you will participate in a learning or practice activity where your main goal will be to use GitHub Copilot for code refactoring using the C# programming language. You will also be generating unit test functions using GitHub Copilot Chat.

### Task 1

1. Look at the example of poorly written C# code in the `poorly_written.cs` file in the `lab-files` directory and analyze it. How could this code be improved?

Here are a few code-related issues: 
- The code begins with the inclusion of the System namespace for essential input and output operations.
- It defines a constant MAX with a value of 100 to represent the maximum number of elements allowed.
- The Sum method calculates the sum of elements in an array.
- In the Main method:
    - It prompts the user to enter the number of elements (between 1 and 100) and validates the input.
    - Allocates an array 'arr' to store the entered integers.
    - Prompts the user to enter the specified number of integers and validates each input.
    - Calculates the sum of the entered integers using the Sum method.
    - Outputs the sum to the console.
    - There's no need to manually free memory in C# because it manages memory automatically.

### Task 2

2. Open the GitHub Copilot Chat window by clicking the **Chat** extension icon

3. Select the code in `poorly_written.cs` and type the prompt `Refactor the selected code`

4. GitHub Copilot chat will give a response that should look similar to the code below: 

```
using System;

class Program
{
    const int MAX = 100;

    static int Sum(int[] arr)
    {
        int result = 0;
        foreach (int numb in arr)
        {
            result += num;
        }
        return result;
    }

    static void Main()
    {
        int n;
        Console.Write("Enter the number of elements (1-100): ");
        if (!int.TryParse(Console.ReadLine(), out n) || n < 1 || n > MAX)
        {
            Console.WriteLine("Invalid input.")
            Environment.Exit(1);
        }

        int[] arr = new int[n];

        Console.WriteLine("Enter " + n + " integers:");
        for (int i = 0; i < n; i++)
        {
            if (!int.TryParse(Console.ReadLine(), out arr[i]))
            {
                if (!int.TryParse(Console.ReadLine(), out arr[i]))
                {
                    Console.WriteLine("Invalid input. Please enter valid integers.");
                    Environment.Exit(1);
                }
            }
        
        int total = Sum(arr);

        Console.WriteLine(Sum of the numbers: " + total);
        }
    }
}
```

5. Analyze the changes made to the code by GitHub Copilot Chat. What has changed?

- Here, GitHub Copilot removed the n parameter from the Sum method since it's not needed. Instead, the Copilot used a for-each loop to iterate over the array. As a result, the code is easier to comprehend and more concise.
- This includes the system namespace for input and output operations.
- Defines a constant MAX with a value of 100 for the maximum number of elements allowed in an array.
- The Sum method calculates the sum of elements in an integer array using a for-each loop.
- In the Main method:
    - Asks the user to input the number of elements and validate it.
    - Creates an integer array to store user-entered values.
    - Prompts the user to enter integers, validates the input, and stores them in the array.
    - Calculates the sum of the integers using the Sum method.
    - Shows the sum on the console.
    - The code includes input validation and provides the sum of user-entered integers.

6. Insert the code into a new file named `well_written.cs` into the `lab-files` directory

### Task 3

7. Open the file named `codechat.cs`

***Note:** If you see a recommendation to install the C# extension, click on **Install**

8. Ask Copilot to use if-else statements instead of the current switch statement. Identify the second of code where the switch is present, and select it

9. Right-click on the code window and select **Copilot**, from the presented list of options, select **Start Code Chat**

10. Type the prompt `Use if-else statements instead of the switch statement`. Click `>` or press `Enter`

11. Review the response that Copilot provided, click **Accept** or **Discard** based on the code provided

12. Save the changes made to `codechat.cs`
