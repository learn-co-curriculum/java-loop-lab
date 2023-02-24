# Loop Lab

## Learning Goals

- Practice implementing the different loops that Java offers.

## Introduction

In this lab, practice implementing the various loops that Java offers. We'll
also practice debugging to observe the control flow when using loops.

Fork and clone this repository. When you do, you will see two files: `Lab1.java`
and `Lab2.java`. This assignment consists of some starter code and comments to
guide you. Follow the instructions below.

## Instructions

There are two parts to this lab:

1. Debugging and fixing a program to produce the appropriate output.
2. Choosing the appropriate loop given a scenario.

The first part can be found in `Lab1.java` and the second part will be in
`Lab2.java`.

### `Lab1.java` Instructions

In this program, we want to determine how many years have passed from 2000
to 2011. Notice that these are the values assigned to `startingYear` and
`targetYear` respectively.

Currently, if we run this program, it will provide the following output:

```text
0 year(s) have passed
1 year(s) have passed
2 year(s) have passed
3 year(s) have passed
4 year(s) have passed
5 year(s) have passed
6 year(s) have passed
7 year(s) have passed
8 year(s) have passed
9 year(s) have passed
10 year(s) have passed
```

But we want to modify the program to give the following output instead:

```text
1 year has passed
2 years have passed
3 years have passed
4 years have passed
5 years have passed
6 years have passed
7 years have passed
8 years have passed
9 years have passed
10 years have passed
```

- Make sure the case that outputs "0 year(s) have passed" doesn't run anymore.
  - Hint: It has to do with the way `currentYear` is initialized.
- Since we know exactly how many times we want to go through these specific set
  of instructions, this is better suited for a `for` loop. Change the loop from
  a `while` loop to a `for` loop.
- Add an `if-else` statement inside the loop so that the output can have the
  right spelling for "year(s)" and "have" for every case.
  - See the expected output above.

Hint: Run the program after you finish each bullet point to see if the output is
what you expect it to be.

Run the program after you finished completing the above instructions. You may
also run the program with the IntelliJ debugger, or you can use the Java
Visualizer tool to step through the control flow of this program.

### `Lab2.java` Instructions

In this program, we currently have a menu-driven program. We want the user to
select what menu item they would like for breakfast.

If we run this program with a user input of `2`, this is what currently prints
to the console:

```text
Welcome to the restaurant! What would you like for breakfast?
1. Eggs and Bacon
2. Oatmeal and Mixed Berries
3. Pancakes
2
Enjoy your oatmeal and mixed berries!
```

Modify this program so that the user could continue making selections. For
example, what if the user was putting in a breakfast order for
a family? You would want to re-iterate through this code multiple times.

- Consider the various loops we have learned throughout this section. Choose
  the loop that seems the most appropriate to handle this scenario.
- Use the value of `0` as a sentinel value.
  - Remember, the sentinel value is a value that is used to terminate a loop and
    stop getting inputs.
- Modify the program appropriately to implement the sentinel value.

Run the program after you finished completing the above instructions. You may
also run the program with the IntelliJ debugger, or you can use the Java
Visualizer tool to step through the control flow of this program.

The following is an example of the expected output given the user inputs:

```text
Welcome to the restaurant! What would you like for breakfast?
1. Eggs and Bacon
2. Oatmeal and Mixed Berries
3. Pancakes
1
Enjoy your eggs and bacon!
Welcome to the restaurant! What would you like for breakfast?
1. Eggs and Bacon
2. Oatmeal and Mixed Berries
3. Pancakes
2
Enjoy your oatmeal and mixed berries!
Welcome to the restaurant! What would you like for breakfast?
1. Eggs and Bacon
2. Oatmeal and Mixed Berries
3. Pancakes
3
Enjoy your pancakes!
Welcome to the restaurant! What would you like for breakfast?
1. Eggs and Bacon
2. Oatmeal and Mixed Berries
3. Pancakes
0

```
