
Assignment5A

For Assignment 5, I think there are a lot of potential usages of design patterns. One that immediately stood out to me was to 
have a factory/builder for enemies and floors. We're going to be making a lot of them, and enemies especially could have lots of 
different attributes that would make a huge constructor, so a builder could really help with reducing complexity and code size. 
A singleton design pattern could also be used for the final boss since there will only be one boss object. The decorator pattern could 
also be used to add additional abilities and stats to the main character after level-up. Finally an observer pattern would be helpful
since our main character will be constantly changing stats, gold, etc, so it would allow easy notifcation to classes handling shops and fights.
These are just some rough ideas that I will iron out and decide on. 


%Assignment5B%
My first design pattern is a Builder pattern focusing on making the Characters that play the game. This builder is used to make character objects that 
dont always require every initiazation variable.
With my CharacterBuilder and related classes, I fulfilled the following requirements:

“You must be able to choose a class for your character (or have it assigned randomly), 
each class has a different subset of skills or magic. A class would constitute something along the lines of ’fighter’, ’mage’, ’thief’, get creative with it! “

“You should be able to choose a type for your character (or have it assigned randomly), 
each race should have one passive skill that gets better after leveling up or that gives them advantage over another. rate 
A type would constitute something like, ’orc’, ’elf’, ’dwarf’, ’human’. Perhaps orcs are stronger naturally, 
perhaps elves are the most nimble and can dodge better, maybe humans have less HP but gain exp at a faster, get creative with it!”

“Your character should be able to equip items such as a sword, shield, helmet, armor, boots, etc. 
Your character should be able to equip a minimum of 3 unique item types. 
You get to decide what happens if you come across a second item type. 
For example, if you have 3 different swords you have programmed, and you have one equipped and come across another, 
does it automatically replace the old one? Does it compare stats and pick the better one? What happens if you don’t take it? 
If you only have one sword programmed and you already have one equipped and come across a new one, what happens?”

“Your character should have at minimum: – Stats: Attack, Health, Mana/Other Resource such as cooldown, Defense, and speed. 
Others can be added. – Should have at least 1 skill or magic power they can use – Physical attacks should have a chance to critically strike (double damage) – 
All attacks should have a chance to fail/miss – Attacks should deal a min damage of 1” 

“You gain experience from winning battles, at certain thresholds you should be able to 
choose a skill or magic power to upgrade. For example:”

My second design pattern is a Factory pattern making enemies to fight against. This pattern is used to easily have three different 
types of enemies, small, medium, and boss, andd build them off an abstract enemy class.
With my EnemyFactory I fulfilled:

“You should encounter a randomly generated ’small’ enemy every floor, a ’medium’ enemy every 5 floors, 
and a ’BOSS’ every 10 floors.”

“All enemies should get harder for each floor you travel to, for example, an enemy on floor 2 should be much, 
much weaker than an enemy on floor 48! “

My final design pattern is a singleton pattern for the final boss. Since there is only one final boss it makes sense to only ever have one object of it.
With my boss singleton I fulfilled the general requirements: 

“The end goal of the game should be a ’Final Boss’ or sorts that is meant to test the culmination of your strength to that point. If you defeat the Final Boss, you win. If you lose against the Final Boss, you do not go back to the first floor, you lose and the game is over!”

I also fulfilled this:

“During combat: – Attacks and item usage should happen in a turn based fashion, 
the participant with the highest speed should go first. – 
When a participant reaches 0 or less HP, they lose the fight, 
if the loser is you, you lose an amount of money and go back to the top floor and only gain 20”
