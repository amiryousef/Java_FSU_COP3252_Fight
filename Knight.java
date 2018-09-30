/*
Yousef, Amir
COP-3252
Assignment4
2/28/2014
*/
import java.util.Random;
public class Knight
{
// declared the variables
private String knightName;
private String opponentName;
private int knightArmor;
private int knightWeapon;
private int knightHitPoints;
private int randomOpponentName;
private int opponentArmor;
private int opponentWeapon;
private int opponentHitPoints;
private String knightArmorIs;
private String opponentArmorIs;
private String knightWeaponIs;
private String opponentWeaponIs;
private int knightDamage = 0;
private int opponentDamage = 0;
private int DamageDealt = 0;
// user defined constructor
public Knight(String name, int armor, int weapon, int hitPoints)
{
knightName = name;
knightArmor = armor;
knightWeapon = weapon;
knightHitPoints = hitPoints;
}
// auto generated constructor
public Knight(int name, int armor, int weapon, int hitPoints)
{
randomOpponentName = name;
opponentArmor = armor;
opponentWeapon = weapon;
opponentHitPoints = hitPoints;
}
// set the knight name
public void setKnightName(String name)
{
knightName = name;
}
// set the opponentht name
public void setOpponentName(String name)
{
opponentName = name;
}
// set the random opponentht name
public void setRandomOpponentName(int name)
{
randomOpponentName = name;
}
// set the knight armor
public void setKnightArmor(int armor)
{
switch (armor)
{
case 1: knightArmorIs = "Metal";
knightDamage -= 700;
break;
case 2: knightArmorIs = "Plate";
knightDamage -= 500;
break;
case 3: knightArmorIs = "Chain";
knightDamage -= 300;
break;
case 4: knightArmorIs = "Leather";
knightDamage -= 100;
break;
}
}
// set the opponent armor
public void setOpponentArmor(int armor)
{
switch (armor)
{
case 1: opponentArmorIs = "Metal";
opponentDamage -= 700;
break;
case 2: opponentArmorIs = "Plate";
opponentDamage -= 500;
break;
case 3: opponentArmorIs = "Chain";
opponentDamage -= 300;
break;
case 4: opponentArmorIs = "Leather";
opponentDamage -= 100;
break;
}
}
// set the knight weapon 
public void setKnightWeapon(int weapon)
{
switch (weapon)
{
case 1: knightWeaponIs = "Long Sword";
knightDamage += 1000;
break;
case 2: knightWeaponIs = "Battle Axe";
knightDamage += 800;
break;
case 3: knightWeaponIs = "Spear";
knightDamage += 600;
break;
case 4: knightWeaponIs = "Warhammer";
knightDamage += 400;
break;
}
}
// set the Opponent weapon 
public void setOpponentWeapon(int weapon)
{
switch (weapon)
{
case 1: opponentWeaponIs = "Long Sword";
opponentDamage += 1000;
break;
case 2: opponentWeaponIs = "Battle Axe";
opponentDamage += 800;
break;
case 3: opponentWeaponIs = "Spear";
opponentDamage += 600;
break;
case 4: opponentWeaponIs = "Warhammer";
opponentDamage += 400;
break;
}
}
// determine the damage
public int fight()
{
DamageDealt = opponentHitPoints - knightDamage;
return DamageDealt;
}
// determine the winner
public void win()
{
if(knightHitPoints <= 0)
{
System.out.println("The Opponent is the winner");
}
if(opponentHitPoints <= 0)
{
System.out.println("The knight is the winner");
}
}
// set the hit points
public void setHitPoints(int hitPoints)
{
Random randomHitPoints = new Random();
knightHitPoints = randomHitPoints.nextInt(1000);
opponentHitPoints = randomHitPoints.nextInt(1000);
}
// get the knight name
public String getKnightName()
{
return knightName;
}
// get the opponent name
public String getOpponentName()
{
return opponentName;
}
// get the random opponent name
public int getRandomOpponentName()
{
return randomOpponentName;
}
// get the knight armor
public int getKnightArmor()
{
return knightArmor;
}
// get the opponent armor
public int getOpponentArmor()
{
return opponentArmor;
}
// get the knight weapon
public String getKnightWeapon()
{
return knightWeaponIs;
}
// get the knight weapon
public String getOpponentWeapon()
{
return opponentWeaponIs;
}
// get the knight hit points
public int getknightHitPoints()
{
return knightHitPoints;
}
// get the opponent hit points
public int getOpponentHitPoints()
{
return opponentHitPoints;
}
// display the attributes
public String toString()
{
return "\n Knight Name: " + getKnightName() + "\n Knight Armor: " + getKnightArmor() 
+ "\n Knight Weapon: " + getKnightWeapon() + "\n Knight HitPoints: " + getknightHitPoints() 
+ "\n Knight Damage: " + fight() + "\n\n"; 
}
}
