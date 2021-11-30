# Java: Data Structures
This is the repository for the LinkedIn Learning course Java: Data Structures. The full course is available from [LinkedIn Learning][lil-course-url].

![Java: Data Structures][lil-thumbnail-url] 

Data structures are used in almost all applications, so developers need to know what they are and how to use the most common ones. In this course, instructor Bethan Palmer explains what data structures in Java are and what you can do with some of the most common types. After giving some definitions, Bethan presents what you should consider when choosing a data structure, such as different levels of speed and performance. She shows you what arrays are and the pros and cons of using them, then walks you through how to create arrays and perform operations on them. Then Bethan dives into Java Collections, starting with the Collection interface. Most data structures in Java implement the Collection interface, so understanding what it is and how it works is key. Bethan goes over stacks, queues, and TreeSets, then concludes with a challenge and solution set exploring how to create and perform operations on some Java Collections.

## Instructions
This repository has branches for each of the videos in the course. You can use the branch pop up menu in github to switch to a specific branch and take a look at the course at that stage, or you can add `/tree/BRANCH_NAME` to the URL to go to the branch you want to access.

## Branches
The branches are structured to correspond to the videos in the course. The naming convention is `CHAPTER#_MOVIE#`. As an example, the branch named `02_03` corresponds to the second chapter and the third video in that chapter. 
Some branches will have a beginning and an end state. These are marked with the letters `b` for "beginning" and `e` for "end". The `b` branch contains the code as it is at the beginning of the movie. The `e` branch contains the code as it is at the end of the movie. The `main` branch holds the final state of the code when in the course.

When switching from one exercise files branch to the next after making changes to the files, you may get a message like this:

    error: Your local changes to the following files would be overwritten by checkout:        [files]
    Please commit your changes or stash them before you switch branches.
    Aborting

To resolve this issue:
	
    Add changes to git using this command: git add .
	Commit changes using this command: git commit -m "some message"

## Installing
1. To use these exercise files, you must have the following installed:
    - Git
    - Java 8 or above
2. Clone this repository into your local machine using the terminal (Mac), CMD (Windows), or a GUI tool like SourceTree.
3. Open the code in your chosen IDE.



### Instructor

Bethan Palmer 
                            
Software Developer

                            

Check out my other courses on [LinkedIn Learning](https://www.linkedin.com/learning/instructors/bethan-palmer).

[lil-course-url]: https://www.linkedin.com/learning/java-data-structures-14403471
[lil-thumbnail-url]: https://cdn.lynda.com/course/3001429/3001429-1637691383533-16x9.jpg
