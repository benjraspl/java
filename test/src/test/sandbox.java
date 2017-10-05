package test;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class sandbox {
		public static void main(String [] args) throws IOException{
			 
			 File f = null;

			 int height = 1000;
			 int width = 1000;
			 BufferedImage clr = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			 
			 int a,r,b,g,p;
			 
			 for (int x = 0; x < width; x++) {
				 for (int y = 0; y < height; y++) {
					 
					  a = (int)(Math.random()*256);
					  r = (int)(Math.random()*256);
					  g = (int)(Math.random()*256);
					  b = (int)(Math.random()*256);
					  p = (a<<24) | (r<<16) | (g<<8) | b;
					  clr.setRGB(x,y,p);
				 }
			 }
			 try {
			 f = new File("/Users/leonbrandhoff/Desktop/test.png");
			 ImageIO.write(clr, "png",f);
			 } catch (IOException e) {
				 System.out.println("Error: "+e);
			 }
	} }