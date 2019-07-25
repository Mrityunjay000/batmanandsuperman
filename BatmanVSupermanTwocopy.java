//Name: Mrityunjay Mishra
//Class: CS
//Date: 5/12/17
//Project Name: BatmanVSuperman

/*
 The responses for the BatmanStory are, in order, the following:
 Run, The Joker, normal, Joker, Bruce, hug, The Flash, Grodd, fake death.
 
 The responses for the SupermanStory are, in order, the following:
 punch, destroy, up, Laser, owl, let go, talk, Scarecrow. 
 
 Please note that this game is case sensitive. 
 */

//import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;
import java.io.*;
import javax.imageio.*;
import java.awt.*;
import javax.swing.Timer;

public class BatmanVSupermanTwocopy {
	private static String[] ray = {" "," "," "," "," "," "," "," "," "," "};
	private static JFrame frame, f2;
	private static JPanel panel, p2;
	private static JLabel Label,label, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14;
	private static JTextField field, field2;
	private static int x = 0;
	private static String response = "";
	private static Timer timer;
	private static final int SLEEP = 2000;
	
	
	
	
	public static void BatmanStory(){
		
		frame = new JFrame("BatmanVSuperman");
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setSize(1000, 600);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		panel = new JPanel();
		/*ImageIcon test1 = new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Batman1.jpg");
		ImageIcon test2 = new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Batman2.jpg");
		ImageIcon test3 = new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Batman3.jpg");
		ImageIcon test4 = new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Batman4.jpg");
		ImageIcon test5 = new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Batman5.jpg");
		ImageIcon test6 = new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Batman6.jpg");
		ImageIcon test7 = new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Batman7.jpg");
		ImageIcon test8 = new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Batman8.jpg");
		ImageIcon test9 = new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Batman9.jpg");
		ImageIcon test10 = new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Batman10.jpg");*/
		label = new JLabel("It is finally time for Bat of Gotham to take on the God of Metropolis. Batman can either take a kryptonite sword of he can run in his batmobile.");
		l2 = new JLabel("What should he do? Type in either 'Run' or 'Sword'");
		l3 = new JLabel("");
		l4 = new JLabel(new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Batman1.jpg"));
		l5 = new JLabel(new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Batman2.jpg"));
		l6 = new JLabel(new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Batman3.jpg"));
		l7 = new JLabel(new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Batman4.jpg"));
		l8 = new JLabel(new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Batman5.jpg"));
		l9 = new JLabel(new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Batman6.jpg"));
		l10 = new JLabel(new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Batman7.jpg"));
		l11 = new JLabel(new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Batman8.jpg"));
		l12 = new JLabel(new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Batman9.jpg"));
		l13 = new JLabel(new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Batman10.jpg"));
		l14 = new JLabel(new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/BatmanDies.jpg"));
		panel.add(l4);
		panel.add(label);
		panel.add(l2);
		panel.add(l3);
		//panel.add(field);
		frame.add(panel);
		
		//image = new ImageIcon(getClass().getResource());
		
		field = new JTextField(20);
		//frame.repaint();
		
		
			
			field.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					String input = field.getText();
					
					switch(input){
					case "hello": System.out.println("HELLO"); System.exit(0);
					case "Run": label.setText(" So Batman goes to the batcave. Now should he take The Joker’s help or Robins help?"); 
							l2.setText("Type either 'robin' or 'The Joker'.");
							l3.setText("");
							//l4 = new JLabel(test2);
							panel.remove(l4);
							panel.add(l5);
							frame.repaint();
							ray[0] = input; break;
					case "The Joker": label.setText("The Joker gives Batman a revolver. Should he put kryptonite bullets in the revolver or normal bullets?"); 
							l2.setText("Enter either 'kryptonite' or 'normal'.");
							l3.setText("");
							//l4 = new JLabel(test3);
							panel.remove(l5);
							panel.add(l6);
							frame.repaint();
							ray[1] = input; break;
					case "normal": label.setText("Bullets in place. Should Batman try to fire at Robin or The Joker?"); 
							l2.setText("Enter in either 'Robin' or 'Joker'.");
							l3.setText("");
							//l4 = new JLabel(test4);
							panel.remove(l6);
							panel.add(l7);
							frame.repaint();
							ray[2] = input; break;
					case "Joker": label.setText("Batman fires at the Joker, but Superman doesn’t want him to die, and saves him. Gordon gets mad and he arrests Superman."); 
							l2.setText("Should Batman sneak into Superman’s jail as Batman or go to him as Bruce Wayne?");
							l3.setText("Enter in either 'Batman' or 'Bruce'.");
							//l4 = new JLabel(test5);
							panel.remove(l7);
							panel.add(l8);
							frame.repaint();
							ray[3] = input; break;
					case "Bruce": label.setText("Batman goes as Bruce. He in now in the cell with Superman. Should he fight him, or should he hug him?"); 
							l2.setText("Enter in either 'hug' or 'fight'.");
							//l4 = new JLabel(test6);
							l3.setText("");
							panel.remove(l8);
							panel.add(l9);
							frame.repaint();
							ray[4] = input; break;
					case "hug": label.setText("Bruce hugs and him and tells him: “Tag team fight tonight on the rooftop”."); 
							l2.setText("Should Bruce choose Wonder Woman as his partner, or the Flash?");
							l3.setText("Enter in either 'Wonder Woman' or 'The Flash'.");
							//l4 = new JLabel(test7);
							panel.remove(l9);
							panel.add(l10);
							frame.repaint();
							ray[5] = input; break; 
							
					case "The Flash": label.setText("The Flash agrees, but he doesn’t think that he can actually help Batman in any way, because Superman’s partner is Grodd."); 
							l2.setText("But Batman has an idea: should he (Batman) fight Superman, or should he fight Grodd?");
							l3.setText("Enter in either 'Superman' or 'Grodd'.");
							//l4 = new JLabel(test8);
							panel.remove(l10);
							panel.add(l11);
							frame.repaint();
							ray[6] = input; break;
					case "Grodd": label.setText("Fighting Grodd was easy; he is a Gorilla, so Batman bribed him with his huge banana stash to fight Superman instead.");
							l2.setText("Now, should Batman tell Grodd to fake his death, or should he tell him to distract Superman while he tries to ask Darkeseid for help? ");
							l3.setText("Enter in either 'fake death' or 'distract'.");
							//l4 = new JLabel(test9);
							panel.remove(l11);
							panel.add(l12);
							frame.repaint();
							ray[7] = input; break;
					case "fake death": label.setText("Grodd fakes his death, and Superman gets depressed because he loves animals. Batman tries to help out his buddy and ");
							l2.setText("tells Superman that he can end his pain permanently by eating some kryptonite sleeping pills.Superman, despite knowing what was going to happen,");
							l3.setText(" takes the pills anyways and dies. Great Job. You sucessfully killed Superman! Press any key from a-z to exit.");
							//l4 = new JLabel(test10);
							panel.remove(l12);
							panel.add(l13);
							frame.repaint();
							x = 1;
							break;
					
					case "Sword": label.setText("The sword is too heavy; by the time superman kills batman."); x=1; 
					//String response = "";
					panel.add(label);
					panel.remove(l2);
					panel.remove(l3);
					panel.remove(l4);
					panel.add(l2);
					panel.add(l3);
					panel.add(l14);
					frame.repaint();
					ray[0] = input;
					//System.out.println("Your responses, from the beginning, were: ");
					l2.setText("Your responses, from the beginning, were:");
					for(int i = 0; i < ray.length; i++){
						if(!(ray[i].equals(" "))){
							//System.out.println("Response " + (i+1) + " was " + ray[i]);
							response = response + "Response " + (i+1) + " was " + ray[i] + ";" + " ";
							l3.setText(response + " Press any key from a-z to exit.");
							
							
						}
					}
					
					break;
					
					
					case "robin": label.setText("Robin is a Superman fan so he kills batman"); x=1; 
					panel.add(label);
					panel.remove(l2);
					panel.remove(l3);
					panel.remove(l5);
					panel.add(l2);
					panel.add(l3);
					panel.add(l14);
					frame.repaint();
					ray[1] = input;
					//System.out.println("Your responses, from the beginning, were: ");
					l2.setText("Your responses, from the beginning, were:");
					for(int i = 0; i < ray.length; i++){
						if(!(ray[i].equals(" "))){
							//System.out.println("Response " + (i+1) + " was " + ray[i]);
							response = response + "Response " + (i+1) + " was " + ray[i] + ";" + " ";
							l3.setText(response + " Press any key from a-z to exit.");
						}
					}
					
					break;
					//System.exit(0);
					case "kryptonite": label.setText("It’s a classic revolver from 1835. It can’t fit kryptonite bullets. But while Batman tries, he is punched to Mars by Superman, and he implodes in space."); x=1; 
					panel.add(label);
					panel.remove(l2);
					panel.remove(l3);
					panel.remove(l6);
					panel.add(l2);
					panel.add(l3);
					panel.add(l14);
					frame.repaint();
					ray[2] = input;
					//System.out.println("Your responses, from the beginning, were: ");
					l2.setText("Your responses, from the beginning, were:");
					for(int i = 0; i < ray.length; i++){
						if(!(ray[i].equals(" "))){
							//System.out.println("Response " + (i+1) + " was " + ray[i]);
							response = response + "Response " + (i+1) + " was " + ray[i] + ";" + " ";
							l3.setText(response + " Press any key from a-z to exit.");
						}
					}
					
					break;
					//System.exit(0);
					case "Robin": label.setText("Batman is too scared of firing at Robin because he thinks that Alfred will beat him up, so he can’t, and in the time being, Superman kills him. "); x=1; 
					panel.add(label);
					panel.remove(l2);
					panel.remove(l3);
					panel.remove(l7);
					panel.add(l2);
					panel.add(l3);
					panel.add(l14);
					frame.repaint();
					ray[3] = input;
					//System.out.println("Your responses, from the beginning, were: ");
					l2.setText("Your responses, from the beginning, were:");
					for(int i = 0; i < ray.length; i++){
						if(!(ray[i].equals(" "))){
							response = response + "Response " + (i+1) + " was " + ray[i] + ";" + " ";
							l3.setText(response + " Press any key from a-z to exit.");
						}
					}
					
					break;
					//System.exit(0);
					case "Batman": label.setText("Batman tries to sneak in, but he is eaten by Killer Croc."); x=1; 
					panel.add(label);
					panel.remove(l2);
					panel.remove(l3);
					panel.remove(l8);
					panel.add(l2);
					panel.add(l3);
					panel.add(l14);
					frame.repaint();
					ray[4] = input;
					//System.out.println("Your responses, from the beginning, were: ");
					l2.setText("Your responses, from the beginning, were:");
					for(int i = 0; i < ray.length; i++){
						if(!(ray[i].equals(" "))){
							response = response + "Response " + (i+1) + " was " + ray[i] + ";" + " ";
							l3.setText(response + " Press any key from a-z to exit.");
						}
					}
					
					break;
					//System.exit(0);
					case "fight": label.setText("Yeah Wayne is rich, but he can’t just fight someone in jail. He gets arrested too."); x=1;
					panel.add(label);
					panel.remove(l2);
					panel.remove(l3);
					panel.remove(l9);
					panel.add(l2);
					panel.add(l3);
					panel.add(l14);
					frame.repaint();
					ray[5] = input;
					//System.out.println("Your responses, from the beginning, were: ");
					l2.setText("Your responses, from the beginning, were:");
					for(int i = 0; i < ray.length; i++){
						if(!(ray[i].equals(" "))){
							response = response + "Response " + (i+1) + " was " + ray[i] + ";" + " ";
							l3.setText(response + " Press any key from a-z to exit.");
						}
					}
					
					break;
					//System.exit(0);
					case "Wonder Woman": label.setText("Wonder Woman is Superman’s girlfriend, she kills Batman instead."); x=1; 
					panel.add(label);
					panel.remove(l2);
					panel.remove(l3);
					panel.remove(l10);
					panel.add(l2);
					panel.add(l3);
					panel.add(l14);
					frame.repaint();
					ray[6] = input;
					//System.out.println("Your responses, from the beginning, were: ");
					l2.setText("Your responses, from the beginning, were:");
					for(int i = 0; i < ray.length; i++){
						if(!(ray[i].equals(" "))){
							response = response + "Response " + (i+1) + " was " + ray[i] + ";" + " ";
							l3.setText(response + " Press any key from a-z to exit.");
						}
					}
					
					break;
					//System.exit(0);
					case "Superman": label.setText("Fighting Superman was useless, he was too tired from two days back. He got killed in 5 seconds."); x=1; 
					panel.add(label);
					panel.remove(l2);
					panel.remove(l3);
					panel.remove(l11);
					panel.add(l2);
					panel.add(l3);
					panel.add(l14);
					frame.repaint();
					ray[7] = input;
					//System.out.println("Your responses, from the beginning, were: ");
					l2.setText("Your responses, from the beginning, were:");
					for(int i = 0; i < ray.length; i++){
						if(!(ray[i].equals(" "))){
							response = response + "Response " + (i+1) + " was " + ray[i] + ";" + " ";
							l3.setText(response + " Press any key from a-z to exit.");
						}
					}
					
					break;
					//System.exit(0);
					case "distract": label.setText("Batman should have guessed it; Gorillas can distract Gods for only so long. Superman ends up beating Grodd and the Flash and he beats up Batman."); x=1; 
					panel.add(label);
					panel.remove(l2);
					panel.remove(l3);
					panel.remove(l12);
					panel.add(l2);
					panel.add(l3);
					panel.add(l14);
					frame.repaint();
					ray[7] = input;
					//System.out.println("Your responses, from the beginning, were: ");
					l2.setText("Your responses, from the beginning, were:");
					for(int i = 0; i < ray.length; i++){
						if(!(ray[i].equals(" "))){
							response = response + "Response " + (i+1) + " was " + ray[i] + ";" + " ";
							l3.setText(response + " Press any key from a-z to exit.");
						}
					}
					
					break;
					
					case "a": System.exit(0);
					case "b": System.exit(0);
					case "c": System.exit(0);
					case "d": System.exit(0);
					case "e": System.exit(0);
					case "f": System.exit(0);
					case "g": System.exit(0);
					case "h": System.exit(0);
					case "i": System.exit(0);
					case "j": System.exit(0);
					case "k": System.exit(0);
					case "l": System.exit(0);
					case "m": System.exit(0);
					case "n": System.exit(0);
					case "o": System.exit(0);
					case "p": System.exit(0);
					case "q": System.exit(0);
					case "r": System.exit(0);
					case "s": System.exit(0);
					case "t": System.exit(0);
					case "u": System.exit(0);
					case "v": System.exit(0);
					case "w": System.exit(0);
					case "x": System.exit(0);
					case "y": System.exit(0);
					case "z": System.exit(0);
					 
					}
					
					
				}
			});
			/*panel.add(l4);
			panel.add(label);
			panel.add(l2);
			panel.add(l3);
			panel.add(field);
			frame.add(panel);*/
			
			panel.add(field);
		

	}
	
	public static void SupermanStory(){
		
		frame = new JFrame("BatmanVSuperman");
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setSize(1000, 600);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		panel = new JPanel();
		label = new JLabel("It is finally time for the God of Metropolis to take on the Bat of Gotham! Superman can either shoot a laser at Batman, or he can punch him. What should he do?");
		l2 = new JLabel("Type in either 'laser' or 'punch'");
		l3 = new JLabel("");
		l4 = new JLabel(new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Super1.jpg"));
		l5 = new JLabel(new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Super2.jpg"));
		l6 = new JLabel(new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Super3.jpg"));
		l7 = new JLabel(new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Super4.jpg"));
		l8 = new JLabel(new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Super5.jpg"));
		l9 = new JLabel(new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Super6.jpg"));
		l10 = new JLabel(new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Super7.jpg"));
		l11 = new JLabel(new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Super8.jpg"));
		l12 = new JLabel(new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/Super9.jpg"));
		//l13 = new JLabel(new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/SuperDies.jpg"));
		l14 = new JLabel(new ImageIcon("/Users/mrityunjaymishra/Documents/workspace/BatmanAndSuperman/bin/SuperDies.jpg"));
		panel.add(l4);
		panel.add(label);
		panel.add(l2);
		panel.add(l3);
		//panel.add(field);
		frame.add(panel);
		
		//image = new ImageIcon(getClass().getResource());
		
		field = new JTextField(20);
		//frame.repaint();
		
		
			
			field.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					String input = field.getText();
					
					switch(input){
					case "hello": System.out.println("HELLO"); System.exit(0);
					case "punch": label.setText("Bats has too much abs; Superman broke his arm. But that’s OK, there is still hope."); 
							l2.setText("Should Superman try to kick Batman or should he try to destroy the Batmobile?");
							l3.setText("Type either 'destroy' or 'kick'.");
							//l4 = new JLabel(test2);
							panel.remove(l4);
							panel.add(l5);
							frame.repaint();
							ray[0] = input; break;
					case "destroy": label.setText("Destroying the Batmobile was a good idea, because now Bats can’t run away."); 
							l2.setText("Should Superman now start flying up or down (as in should he start flying in the ground)?");
							l3.setText("Enter either 'up' or 'down'.");
							//l4 = new JLabel(test3);
							panel.remove(l5);
							panel.add(l6);
							frame.repaint();
							ray[1] = input; break;
					case "up": label.setText("Alright, now that he is in the air, should Superman yell at Batman to destroy his eardrums, or should he use another laser beam attack"); 
							l2.setText("Enter in either 'yell' or 'Laser'.");
							l3.setText("");
							//l4 = new JLabel(test4);
							panel.remove(l6);
							panel.add(l7);
							frame.repaint();
							ray[2] = input; break;
					case "Laser": label.setText("Superman finally breaks Batman’s shield, but it’s not over yet. Should he try to throw a plane or an owl at Batman."); 
							l2.setText("Enter in either 'airplane' or 'owl'.");
							l3.setText("");
							//l4 = new JLabel(test5);
							panel.remove(l7);
							panel.add(l8);
							frame.repaint();
							ray[3] = input; break;
					case "owl": label.setText("Bats are scared of owls, and it works! Batman starts to run away. Should Superman chase him or let him go?"); 
							l2.setText("Enter in either 'chase' or 'let go'.");
							//l4 = new JLabel(test6);
							l3.setText("");
							panel.remove(l8);
							panel.add(l9);
							frame.repaint();
							ray[4] = input; break;
					case "let go": label.setText("A good fighter is always patient. Not running after him paid off, because Alfred disowned him."); 
							l2.setText("Now Bats is sad. Should Superman try to fight Batman or talk to him?");
							l3.setText("Enter in either 'talk' or 'fight'.");
							//l4 = new JLabel(test7);
							panel.remove(l9);
							panel.add(l10);
							frame.repaint();
							ray[5] = input; break; 
							
					case "talk": label.setText("Talking to Batman was a great idea. Now Superman knows how to kill him. Should he go and talk to the Joker or to Scarecrow"); 
							l2.setText("Enter in either 'Scarecrow' or 'Joker'.");
							l3.setText("");
							//l4 = new JLabel(test8);
							panel.remove(l10);
							panel.add(l11);
							frame.repaint();
							ray[6] = input; break;
					case "Scarecrow": label.setText("Scarecrow was the right person: he kills Batman with his toxin.");
							l2.setText("Superman arrests him for killing Batman and still remains a hero.Great Job, you Win!");
							l3.setText("Press any key from a-z to exit.");
							//l4 = new JLabel(test9);
							panel.remove(l11);
							panel.add(l12);
							frame.repaint();
							ray[7] = input; break;
					/*case "fake death": label.setText("Grodd fakes his death, and Superman gets depressed because he loves animals. Batman tries to help out his buddy and ");
							l2.setText("tells Superman that he can end his pain permanently by eating some kryptonite sleeping pills.Superman, despite knowing what was going to happen,");
							l3.setText(" takes the pills anyways and dies. Great Job. You sucessfully killed Superman! Press any key from a-z to exit.");
							//l4 = new JLabel(test10);
							panel.remove(l12);
							panel.add(l13);
							frame.repaint();
							x = 1;
							break;*/
					
					case "laser": label.setText("Laser was a bad idea; Batman has a deflective shield that amplified the laser’s power and blew Superman off the planet."); x=1; 
					//String response = "";
					panel.add(label);
					panel.remove(l2);
					panel.remove(l3);
					panel.remove(l4);
					panel.add(l2);
					panel.add(l3);
					panel.add(l14);
					frame.repaint();
					ray[0] = input;
					//System.out.println("Your responses, from the beginning, were: ");
					l2.setText("Your responses, from the beginning, were:");
					for(int i = 0; i < ray.length; i++){
						if(!(ray[i].equals(" "))){
							//System.out.println("Response " + (i+1) + " was " + ray[i]);
							response = response + "Response " + (i+1) + " was " + ray[i] + ";" + " ";
							l3.setText(response + " Press any key from a-z to exit.");
							
							
						}
					}
					
					break;
					
					
					case "kick": label.setText("Man, did Superman not realize that Batman has too much muscle? He breaks his legs and loses."); x=1; 
					panel.add(label);
					panel.remove(l2);
					panel.remove(l3);
					panel.remove(l5);
					panel.add(l2);
					panel.add(l3);
					panel.add(l14);
					frame.repaint();
					ray[1] = input;
					//System.out.println("Your responses, from the beginning, were: ");
					l2.setText("Your responses, from the beginning, were:");
					for(int i = 0; i < ray.length; i++){
						if(!(ray[i].equals(" "))){
							//System.out.println("Response " + (i+1) + " was " + ray[i]);
							response = response + "Response " + (i+1) + " was " + ray[i] + ";" + " ";
							l3.setText(response + " Press any key from a-z to exit.");
						}
					}
					
					break;
					//System.exit(0);
					case "down": label.setText("An attack from the ground is bad. Batman already knows about how to navigate underground places from the Dark Knight Rises. "); x=1; 
					panel.add(label);
					panel.remove(l2);
					panel.remove(l3);
					panel.remove(l6);
					panel.add(l2);
					panel.add(l3);
					panel.add(l14);
					frame.repaint();
					ray[2] = input;
					//System.out.println("Your responses, from the beginning, were: ");
					l2.setText("Your responses, from the beginning, were:");
					for(int i = 0; i < ray.length; i++){
						if(!(ray[i].equals(" "))){
							//System.out.println("Response " + (i+1) + " was " + ray[i]);
							response = response + "Response " + (i+1) + " was " + ray[i] + ";" + " ";
							l3.setText(response + " Press any key from a-z to exit.");
						}
					}
					
					break;
					//System.exit(0);
					case "yell": label.setText("Yelling at Batman was a bad idea, because before it hurt him, it hurt other humans. Superman dies out of humiliation."); x=1; 
					panel.add(label);
					panel.remove(l2);
					panel.remove(l3);
					panel.remove(l7);
					panel.add(l2);
					panel.add(l3);
					panel.add(l14);
					frame.repaint();
					ray[3] = input;
					//System.out.println("Your responses, from the beginning, were: ");
					l2.setText("Your responses, from the beginning, were:");
					for(int i = 0; i < ray.length; i++){
						if(!(ray[i].equals(" "))){
							response = response + "Response " + (i+1) + " was " + ray[i] + ";" + " ";
							l3.setText(response + " Press any key from a-z to exit.");
						}
					}
					
					break;
					//System.exit(0);
					case "airplane": label.setText("Superman isn’t strong enough to throw a plane at Batman, he hasn’t worked out enough."); x=1; 
					panel.add(label);
					panel.remove(l2);
					panel.remove(l3);
					panel.remove(l8);
					panel.add(l2);
					panel.add(l3);
					panel.add(l14);
					frame.repaint();
					ray[4] = input;
					//System.out.println("Your responses, from the beginning, were: ");
					l2.setText("Your responses, from the beginning, were:");
					for(int i = 0; i < ray.length; i++){
						if(!(ray[i].equals(" "))){
							response = response + "Response " + (i+1) + " was " + ray[i] + ";" + " ";
							l3.setText(response + " Press any key from a-z to exit.");
						}
					}
					
					break;
					//System.exit(0);
					case "chase": label.setText("Chasing him was a bad idea, Batman is WAY too fast."); x=1;
					panel.add(label);
					panel.remove(l2);
					panel.remove(l3);
					panel.remove(l9);
					panel.add(l2);
					panel.add(l3);
					panel.add(l14);
					frame.repaint();
					ray[5] = input;
					//System.out.println("Your responses, from the beginning, were: ");
					l2.setText("Your responses, from the beginning, were:");
					for(int i = 0; i < ray.length; i++){
						if(!(ray[i].equals(" "))){
							response = response + "Response " + (i+1) + " was " + ray[i] + ";" + " ";
							l3.setText(response + " Press any key from a-z to exit.");
						}
					}
					
					break;
					//System.exit(0);
					case "fight": label.setText("Fighting him doesn’t really help does it?"); x=1; 
					panel.add(label);
					panel.remove(l2);
					panel.remove(l3);
					panel.remove(l10);
					panel.add(l2);
					panel.add(l3);
					panel.add(l14);
					frame.repaint();
					ray[6] = input;
					//System.out.println("Your responses, from the beginning, were: ");
					l2.setText("Your responses, from the beginning, were:");
					for(int i = 0; i < ray.length; i++){
						if(!(ray[i].equals(" "))){
							response = response + "Response " + (i+1) + " was " + ray[i] + ";" + " ";
							l3.setText(response + " Press any key from a-z to exit.");
						}
					}
					
					break;
					//System.exit(0);
					case "Joker": label.setText("The Joker is useless, he just wants to beat Bats, not kill him."); x=1; 
					panel.add(label);
					panel.remove(l2);
					panel.remove(l3);
					panel.remove(l11);
					panel.add(l2);
					panel.add(l3);
					panel.add(l14);
					frame.repaint();
					ray[7] = input;
					//System.out.println("Your responses, from the beginning, were: ");
					l2.setText("Your responses, from the beginning, were:");
					for(int i = 0; i < ray.length; i++){
						if(!(ray[i].equals(" "))){
							response = response + "Response " + (i+1) + " was " + ray[i] + ";" + " ";
							l3.setText(response + " Press any key from a-z to exit.");
						}
					}
					
					break;
					
					
					case "a": System.exit(0);
					case "b": System.exit(0);
					case "c": System.exit(0);
					case "d": System.exit(0);
					case "e": System.exit(0);
					case "f": System.exit(0);
					case "g": System.exit(0);
					case "h": System.exit(0);
					case "i": System.exit(0);
					case "j": System.exit(0);
					case "k": System.exit(0);
					case "l": System.exit(0);
					case "m": System.exit(0);
					case "n": System.exit(0);
					case "o": System.exit(0);
					case "p": System.exit(0);
					case "q": System.exit(0);
					case "r": System.exit(0);
					case "s": System.exit(0);
					case "t": System.exit(0);
					case "u": System.exit(0);
					case "v": System.exit(0);
					case "w": System.exit(0);
					case "x": System.exit(0);
					case "y": System.exit(0);
					case "z": System.exit(0);
					 
					}
					
					
				}
			});
			/*panel.add(l4);
			panel.add(label);
			panel.add(l2);
			panel.add(l3);
			panel.add(field);
			frame.add(panel);*/
			
			panel.add(field);
	}
		
		
	

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		f2 = new JFrame("BatmanVSuperman");
		f2.setVisible(true);
		f2.setResizable(true);
		f2.setSize(1000, 600);
		f2.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		p2 = new JPanel();
		Label = new JLabel("Welcome to Batman v. Superman. Who would you like to play as? (Enter 'Batman' or 'Superman')");
		//label.setText();
		field2 = new JTextField(20);
		field2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String input2 = field2.getText();
				if(input2.equals("Batman")){
					BatmanVSupermanTwocopy.BatmanStory();
				}
				else if(input2.equals("Superman")){
					BatmanVSupermanTwo.SupermanStory();
				}
			}
		});
		
		p2.add(Label);
		p2.add(field2);
		f2.add(p2);
		
		/*Scanner keyboard = new Scanner(System.in);
		String resp = "";
		System.out.println("Welcome to Batman v. Superman. Who would you like to play as? (Enter 'Batman' or 'Superman')");
		resp = keyboard.nextLine();
		if(resp.equals("Batman")){
			BatmanVSupermanTwo.BatmanStory();
		}
		else if(resp.equals("Superman")){
			BatmanVSupermanTwo.SupermanStory();
		}*/

	}
}
