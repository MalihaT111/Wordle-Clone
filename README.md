# Wordle-Clone
Name: Maliha Tasnim Name: Rachel Class Period: 9

Wordle Design Document
Game Engine Questions
How do we select the target word?

Create an array of strings?

String[] words {"tooth", "fairy", "crazy", "rings", "mouse"}

int choice = int(random(words.length));

println(words[choice]) ;

How do we switch from one row to another if the word is wrong?

divide the size of the screen

create variables to determine where the placements of the words are

and add to that every time a word in the tmp string is not the target word

How do we know if a word is correct?

create a temporary string variable

if tmpstring contains choice, display choice by calling on a function called drawtarget (string c) which

is supposed to draw the string characters in green at the right position

if tmpstring does not contain choice, display tmpstring (using another function).

How do we realize if one letter is in the word but in the wrong place?

does the choice/ target include this letter (by using a for loop?) if the target includes the letter but the index is not the same, then display the word but make the character that doesn't match turn yellow.

How does the game end? if tmpstring = target, display you win

if the times you press enter exceeds 6 times and tmp string does not equal target

then display the game over screen which will also display target word string in the middle of the screen

Game Interface Questions
How do we collect input from the user? use an empty tmpstring and attach whatever the entered character is into the empty string using append

Either an on screen keyboard or directly from the users keyboard - if a square is pressed then the character is added to the tmpstring

How do we set up the keyboard?

create a function (?) that contains text(key, size, size) as that would make the letter you pressed appear?

and then add that text to the tmp string

How does the player start a new game?
by clicking on a key (s) after the game over page

How do we delete indiviudal characters? if player presses delete, replace the character with a blank?

How does enter work? if the player presses enter, check to see if tmp string = target string

Game File List
Main driver file: Will run the entire game?
I'm not sure if we will have another file
