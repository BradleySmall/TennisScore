# TennisScore
**Copyright © 2021 Bradley M. Small**
## **Rules**

## **Code**

## **Suggestions**

This code is intended as an exercise for me to apply my learning of Java. I am quite open to suggestions and
recommendations for improvement.

## **License**

If you wish to use any of this code for personal and/or educational purposes you may freely do so as long as you do not
claim it as your own. Give a guy a little credit if you use his work.

If you wish to make money with this code, such as publishing it in a tutorial or making a salable product I want a cut
of the action. As unlikely as this may be, simply contact me, so we can work out the details. 

# Challenge follows

I will clean this readme up at some point in the future. However, this is the challenge as I typed it into Quoto in the Fediverse. 
Do not look at my code if you are concerned with spoilers. 

---

#toyprogrammingchallenge 

Okay, here is the challenge for this week. 

Tennis is a cool sport to watch. Especially, if either Serena or Venus or both are playing. :) However, the scoring is really odd, because it is based on the clock face. To make it even more fun, it did come from France, so instead of Zero we refer to l'œuf or "the egg". However, as we now pronounce it , it is "love". I am certain that there can be some interesting jokes in there, but I am not going for any of them. :)

Anyway, when you begin a game both players have scored zero times so their score is said to be "love - love" or "love all". When a player has scored 1 time, they are said to have "15" as advancing around the clock face 1/4 of the way. Their second score would be called "30" since that would be 1/2 way around. Obviously, their third score should be "40" because that forces you to win by 2 :) Not sure it makes sense, but that is how it works. So as an example a game might go like this:
  
love - love  
15 - love  
30 - love  
40 - love  
Game - player1  

Not all games work out that one player gets to run the score, so it could also go like this:  
  
love - love  
15 - love  
15 - 15  
15 - 30  
30 - 30  
30 - 40  
Game - player2  

However, after the 3rd point is scored if both players have 40 the score is said as 
"Deuce" 
Because, France. :)

At any point when a player becomes 2 points ahead after 40 they win, and we say Game - <player name> 
But after the score is tied at 40 or higher, the next point is called "advantage" so we no longer care about the underlying clock face scores, and merely go through "Deuce", "Advantage - player1" "Deuce" "Advantage - player2" "Game - player2". In theory, one could continually bounce from "Deuce" to advantage one player or the other until one of them players simply falls out or dies. Though I am not aware of that ever actually happening. There have been some pretty long games. 

"Back in 1975 on May 26, at the Surrey Grass Court Championships at Surbiton, Anthony Fawcett and Keith Glass racked up a record 37 deuces in a single game for a grand total of 80 points."

But I digress. Here is your challenge if you choose to accept it. 

Write a method/function that takes any legal tennis game score, such as (0, 0) or (5,3) and so on, and have it output the traditional tennis score as described above, "love - love" or "Game - player1" in my example of legal scores. Keep in mind, (12, 2) is not a legal score, as once the first player achieved 4 he would have already won. You don't need to test for this, but be aware it is not a scenario you should have to deal with. You can represent any tie up to 2 simply as 'love - love' or '15 - 15' or '30 - 30' but starting at 3 you would not say '40 - 40' but rather "Deuce" at that level and any higher. If you would like to do so, as a bonus you could represent the simple ties less than 3:3 (Deuce) with the 'all' so 'love all', '15 all', or '30 all' would be a bonus representation, but '40 all' would be incorrect, as it should merely be 'Deuce'.

Use whatever language or methods you like. I am using Java. I will also have unit tests. You are free not to use them, but I am not interested in testing anyone's code for accuracy, so if you don't provide them, the best you can hope for is "Nice job. Good effort. I guess." At least from me :) 
Try to focus on good quality code. Also focus on reduction of complexity, DRY, and certainly use subroutines as necessary. 

Good Luck!!

I will probably be checking mine in to my GitHub or GitLab repo at some point later in the week.

#toyprogrammingchallenge 
