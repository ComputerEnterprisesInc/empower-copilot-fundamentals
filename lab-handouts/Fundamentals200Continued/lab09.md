# Exploring GitHub Copilot's Slash Commands

## Introduction

Slash commands in GitHub Copilot introduce a transformative approach to interacting with the AI-powered coding assistant, greatly enhancing both efficiency and precision for developers. These commands act as intuitive shortcuts, allowing users to directly instruct Copilot to perform specific tasks or generate code patterns, all within their coding environment. This lab will allow you to explore the following slash commands:

- `/explain`
- `/fix`
- `/tests`
- `/new`

**Note:** These labs were generated with VS Code in mind. If any of these tasks use slash commands that are not available in your preferred IDE, please skip. 

### Task 1 - /explain

1. Open the `rps.java` file and read through the file. Try to determine what the file is doing. 

2. Select the code in `rps.java` and open GitHub Copilot Chat. Prompt GitHub Copilot to explain the code using a slash command, ensure that you are selecting all of the code in the file:
- `/explain`

### Task 2 - /fix 

1. There are several bugs in this file: 
- Winning and losing statements are flipped
- There is no handling for an invalid input
- There is no option for the computer to choose "lizard"

2. Select all of the code in `rps.java` and prompt GitHub Copilot to identify the bugs, to see if the tool's evaluation is the same as your own: 
- `Identify any bugs in the selected code`

3. Prompt inline GitHub Copilot Chat (Ctrl + I) to fix each of the problems one at a time.
- `/fix flip the winning and losing statements`
- `/fix add code for handling invalid inputs`
- `/fix add an option for the computer to choose "lizard"`

4. Accept all the suggested changes, and save the file

5. Open your terminal and compile the rps file:
- `javac rps.java`

6. Run the compiled Java file and play the game: 
`java rps`

7. Make changes as necessary, asking GitHub Copilot for help

### Task 3 - /tests

1. Select all of the code in the `rps.java` file

2. Open GitHub Copilot Chat and prompt it to generate tests for the selected code:
- `/tests`

3. Add all of the new tests to a `testRps.java` file in the `lab-files` directory

### Task 4 - /doc

1. Select all of the code in `rps.java` and create documentation for it:
- `/doc create a markdown file of documentation for the file, including what the file does and how to run it`

2. Add the generated documentation to a new file named `rps_documentation.md` in the `lab-files` directory
