# Code Optimization with GitHub Copilot

## Introduction

GitHub Copilot can be used for a variety of refactoring tasks - including optimization, or the process of making our code and software more efficient. It is possible to ask GitHub Copilot to analyze the runtime of certain pieces of code, and make refactoring changes accordingly.

### Task 1 - Merge Sort

1. Open `unoptimized.py` in the `lab-files` directory

2. Analyze the `merge_sort()` function. 

This is an unoptimized version of the merge sort algorithm in Python. It does not use any of the common optimizations such as avoiding the creation of new lists in each recursive call.

3. Determine the time complexity of this sorting algorithm --> O(n log n) because the array is always divided into two halves and these halves are recursively sorted and merged. 

4. Prompt GitHub Copilot Chat to answer research questions regarding merge sort algorithms: 
- `What is the best case time complexity for a merge sort algorithm?`

5. In the `unoptimized.py` file, select all of the code for the `merge_sort()` function. Prompt GitHub Copilot Chat to refactor the code so that it is optimized
- `Optimize the selected code`

6. Add the optimized code into a new file named `optimized.py`

7. Select the newly optimized code and prompt GitHub Copilot Chat to analyze the function time complexity: 
- `What is the time complexity of the selected code?`

8. Compare the answer from step 4 to step 7, determining if GitHub Copilot was able to refactor for optimization. If the algorithm is not optimized, reprompt GitHub Copilot to create an optimized function

9. Save `optimized.py`

### Task 2 - Insertion Sort

1. Open `unoptimized.py` in the `lab-files` directory

2. Analyze the `insertion_sort()` function. 

This is an unoptimized version of the insertion sort algorithm in Python. It does not use any of the common optimizations such as shifting elements over in place instead of swapping or breaking the inner loop when the correct position is found.

3. Determine the time complexity of this sorting algorithm --> O(n^2)

4. Prompt GitHub Copilot Chat to answer research questions regarding merge sort algorithms: 
- `What is the best case time complexity for a insertion sort algorithm?`

5. In the `unoptimized.py` file, select all of the code for the `insertion_sort()` function. Prompt GitHub Copilot Chat to refactor the code so that it is optimized
- `Optimize the selected code`

6. Add the optimized code into the file named `optimized.py`

7. Select the newly optimized code and prompt GitHub Copilot Chat to analyze the function time complexity: 
- `What is the time complexity of the selected code?`

8. Compare the answer from step 4 to step 7, determining if GitHub Copilot was able to refactor for optimization. If the algorithm is not optimized, reprompt GitHub Copilot to create an optimized function

9. Save `optimized.py`

### Task 3 - Selection Sort

1. Open `unoptimized.py` in the `lab-files` directory

2. Analyze the `selection_sort()` function. 

This is an unoptimized version of the selection sort algorithm in Python. It does not use any of the common optimizations such as breaking the outer loop when the array is already sorted.

3. Determine the time complexity of this sorting algorithm --> O(n^2)

4. Prompt GitHub Copilot Chat to answer research questions regarding merge sort algorithms: 
- `What is the best case time complexity for a selection sort algorithm?`

5. In the `unoptimized.py` file, select all of the code for the `selection_sort()` function. Prompt GitHub Copilot Chat to refactor the code so that it is optimized
- `Optimize the selected code`

6. Add the optimized code into the file named `optimized.py`

7. Select the newly optimized code and prompt GitHub Copilot Chat to analyze the function time complexity: 
- `What is the time complexity of the selected code?`

8. Compare the answer from step 4 to step 7, determining if GitHub Copilot was able to refactor for optimization. If the algorithm is not optimized, reprompt GitHub Copilot to create an optimized function

9. Save `optimized.py`

### Task 4 - Bubble Sort

1. Open `unoptimized.py` in the `lab-files` directory

2. Analyze the `bubble_sort()` function. 

This is an unoptimized version of the bubble sort algorithm in Python. It does not use any of the common optimizations such as stopping the algorithm if the inner loop didn't cause any swap.

3. Determine the time complexity of this sorting algorithm --> O(n^2)

4. Prompt GitHub Copilot Chat to answer research questions regarding merge sort algorithms: 
- `What is the best case time complexity for a bubble sort algorithm?`

5. In the `unoptimized.py` file, select all of the code for the `bubble_sort()` function. Prompt GitHub Copilot Chat to refactor the code so that it is optimized
- `Optimize the selected code`

6. Add the optimized code into the file named `optimized.py`

7. Select the newly optimized code and prompt GitHub Copilot Chat to analyze the function time complexity: 
- `What is the time complexity of the selected code?`

8. Compare the answer from step 4 to step 7, determining if GitHub Copilot was able to refactor for optimization. If the algorithm is not optimized, reprompt GitHub Copilot to create an optimized function
