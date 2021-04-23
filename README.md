# The Gacha kata
Learn how to use generics using Java.
## Pre-requirements
- OOP knowledge
- Java 11
## Description
This kata is about building a gacha machine that we could fill with different type of prize and get them.
Gacha machines are quite common in Japan. They are boxes where you introduce a coin and it will give you a random ball that contains some cool minis.
![HTB1MhkwhpuWBuNjSszbq6AS7FXac](https://user-images.githubusercontent.com/39645422/115857248-be697d00-a42d-11eb-9401-8567a54d8f88.jpg)
## Kata steps
1. First step
    - Checkout `first-step` branch and have a look to the code to understand it. Then execute the code. If everything is fine it should be failing. You will have more context about the exercise in the main file.
    - Implement `GachaMachine#fillPrizes` and `GachaMachine#getPrize` methods 
    - If the implementation is ok you should be getting a random superhero in your console. You can always checkout `second-step` branch in case you are stuck.
   
2. Second step
   - Paste the following code under the existing one in your `main` file.
   ```  
   final var pokemonMachine = new GachaMachine();
   pokemonMachine.fillPrizes(new PokemonPrize());
   final var pokemonPrize = pokemonMachine.getPrize();

   // Should display a random pokemon
   System.out.println(pokemonPrize);
   ```
   - Modify your `GachaMachine` to make the code pass.
   - If the implementation is ok you should be getting a random superhero and a random pokemon in your console. You can always checkout `third-step` branch in case you are stuck.
   
3. Third step
   - You may end up having a lot of code duplication inside your `GachaMachine`, but as you may be thinking this will become quite a tedious task to add methods any time you would like to make your gacha machine compatible with more and more prizes. To avoid it we will change our `GachaMachine` to use generics and make it compatible with any kind of prize.
   - Checkout this [lesson](https://docs.oracle.com/javase/tutorial/java/generics/why.html) and understand generics
   - Make your `GachaMachine` to work using generics.
   - After coding the solution you should end up having a small `GachaMachine` class using generics and completed this kata!
   
## Recommendations
Do this exercise pairing with somebody that already knows how generics work, so your pair can solve any question you have about it.
   
   
