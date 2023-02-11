# Loop Lab

## Learning Goals

- Practice implementing the different loops that Java offers.

## Introduction

In this lab, practice implementing the various loops that Java offers. Make use
of the `for` loop, `while` loop, and the `do-while` loop.

Fork and clone this repository. When you do, you will see one file: `Lab.java`.
This assignment consists of some starter code and comments to guide you. Follow
the instructions below.

## Instructions

Assume we want to print the integers from 0 - a number that the user specifies.
For example, if the user enters in a value of 5, the program should print the
numbers 0, 1, 2, 3, 4, 5. You will write the code to accomplish this task using
a `for` loop, `while` loop, and a `do-while` loop.

Note: You can work either of these sections in any order you want. But it may
be easier to get one section working at a time and test before moving onto the
next section.

### For Loop Implementation

In this section, use a `for` loop to accomplish the task described above.

- You _must_ use a `for` loop in this section.
- Go back and review the "For Loops" lesson as needed.
- If it helps, write out the pseudocode in a text editor of what this section
  should look like.
- Hint: Set the initialization statement to a value of `0`.
- To help, try running the program in the IntelliJ debugger or Java Visualizer.

Run the program after you finish completing the above instructions. The output
for this section, if the user entered in `5`, should look like this:

```text
The For Loop prints:
0
1
2
3
4
5
```

### While Loop Implementation

In this section, use a `while` loop to accomplish the task described above.

- You _must_ use a `while` loop in this section.
- Go back and review the "While Loops" lesson as needed.
- If it helps, write out the pseudocode in a text editor of what this section
  should look like.
- Hint: Initialize a sentinel value to `0` prior to entering the loop.
- To help, try running the program in the IntelliJ debugger or Java Visualizer.

Run the program after you finish completing the above instructions. The output
for this section, if the user entered in `5`, should look like this:

```text
The While Loop prints:
0
1
2
3
4
5
```

## Do-While Loop Implementation

In this section, use a `do-while` loop to accomplish the task described above.

- You _must_ use a `do-while` loop in this section.
- Go back and review the "Do-While Loops" lesson as needed.
- If it helps, write out the pseudocode in a text editor of what this section
  should look like.
- To help, try running the program in the IntelliJ debugger or Java Visualizer.

Run the program after you finish completing the above instructions. The output
for this section, if the user entered in `5`, should look like this:

```text
The Do-While Loop prints:
0
1
2
3
4
5
```

## Expected Output

Consider the following expected output dependent on the `maxInteger` the user
enters:

### User Input = 5

```text
Enter a positive integer to count to:
5
The For Loop prints:
0
1
2
3
4
5

The While Loop prints:
0
1
2
3
4
5

The Do-While Loop prints:
0
1
2
3
4
5
```

### User Input = 1

```text
Enter a positive integer to count to:
1
The For Loop prints:
0
1

The While Loop prints:
0
1

The Do-While Loop prints:
0
1
```

### User Input = 10

```text
Enter a positive integer to count to:
10
The For Loop prints:
0
1
2
3
4
5
6
7
8
9
10

The While Loop prints:
0
1
2
3
4
5
6
7
8
9
10

The Do-While Loop prints:
0
1
2
3
4
5
6
7
8
9
10
```

## Consider This

We can implement printing integers within a specific range using any of the
loops that we have learned. Is there a loop you think is more suited for this
problem? If so, why?
