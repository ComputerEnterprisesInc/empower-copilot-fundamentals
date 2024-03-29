# Experimenting with JavaScript AI Code Suggestions

## Introduction

While GitHub Copilot offers recommendations for many languages and frameworks, it excels in particular when it comes to Python, JavaScript, TypeScript, Ruby, Go, C#, and C++. The samples below are in JavaScript, but they should also work in other languages.

In this exercise, you will have the opportunity to experiment with and apply JavaScript with the assistance of GitHub Copilot and GitHub Copilot Chat.

### Task 1

1. Create a new file
2. Name the file `skills.js` and verify that it is empty
3. In the `skills.js` file, type the following function declaration. A whole function body will be suggested by GitHub Copilot (shown in gray text). Precise recommendations will vary

```
function calculateNumbers(var1, var2)
```

4. Press `Tab` to accept the suggestion provided by GitHub Copilot, review, and save the file

5. In the `skills.js` file, type a comment to describe a function that calculates the price of a vehicle based on its gas mileage, year, and number of miles driven.

```
// A function that calculates the price of a vehicle based on gas mileage, year and number of miles driven.
```

6. Press 'Tab` to accept the suggestion provided by GitHub Copilot, review and save the file. Recommendations may look similar to the code as follows: 

```
function calculatePrice(milesPerGallon, year, milesDriven) {
  var price = 0;
  if (year < 2010) {
    price = 10000;
  } else {
    price = 20000;
  }
  if (milesPerGallon < 15) {
    price += 2000;
  }
  if (milesDriven > 10000) {
    price -= 5000;
  }
  return price;
}
```


### Task 3: 

1. Create a **New File**, name your file `index.js` and verify that the file is empty
2. Press `Ctrl + I` to open GitHub Copilot Chat and paste the following comments to create a basic markdown editor

```
/*
Create a basic markdown editor in Next.js with the following features:
- Use react hooks
- Create a state for markdown with the default text "type markdown here"
- A text area where users can write markdown 
- Show a live preview of the markdown text as I type
- Support for basic markdown syntax like headers, bold, and italics 
- Use React markdown npm package 
- The markdown text and resulting HTML should be saved in the component's state and updated in real-time 
*/
```
3. This should prompt GitHub Copilot to generate code to produce a simple, unstyled, markdown editor

4. In the same `index.js` file, enter the following instructions for reversing a sentence

```
take a sentence as input, reverse the input sentence, the start of the sentence must start with a capital. This should be done in javascript
```

5. The generated outcome should look similar to this: 

```
const reverseAndCapitalize = (sentence) => {
    const reversed = sentence.split(' ').reverse().join(' ');
    return reversed.charAt(0).toUpperCase() + recersed.slice(1);
}

console.log(reverseAndCapitalize('hello world')); 
console.log(reverseAndCapitalize('welcome to my test'));
```

# Leverging Multiple Suggestions with GitHub Copilot

## Introduction

While GitHub Copilot offers suggestions for numerous languages and a variety of frameworks, it excels when it comes to Python, JavaScript, TypeScript, Ruby, Go, C#, and C++. The Copilot can also assist in query generation for databases.

In this exercise, you will have the opportunity to explore and apply the use of Python in conjunction with Copilot, and you will do so with the benefit of receiving multiple suggestions.

### Task 1

1. Create a new file named `prime.py` and type the following code: 

```
def prime(n):
```

2. Open a new tab with _multiple_ solutions by pressing `Ctrl + Enter`. GitHub Copilot will generate around 10 different code suggestions in a new tab. Here, you can view the solutions, accept a suggestion (by clicking on **Accept Solution**)

***Note:** Some suggestions provided by GitHub Copilot will be more accurate to your use case than others, please review code carefully to ensure that you are accepting code that will work correctly for your development needs.

3. Save the file.
