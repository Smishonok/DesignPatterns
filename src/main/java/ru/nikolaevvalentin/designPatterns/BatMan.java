//package ru.nikolaevvalentin.designPatterns;
//
//public class BatMan {
//import java.util.*;
//import java.io.*;
//import java.math.*;
//
//
//    /**
//     * Auto-generated code below aims at helping you parse
//     * the standard input according to the problem statement.
//     **/
//    class Player {
//        private static int X0;
//        private static int Y0;
//        private static int N;
//        private static String bombDir;
//        private static String lastDir="";
//
//        private static int xMax;
//        private static int xMin;
//        private static int yMax;
//        private static int yMin;
//
//
//        public static void main(String args[]) {
//            Scanner in = new Scanner(System.in);
//            int W = in.nextInt(); // width of the building.
//            int H = in.nextInt(); // height of the building.
//            N = in.nextInt(); // maximum number of turns before game over.
//            X0 = in.nextInt();
//            Y0 = in.nextInt();
//
//            xMin = 0;
//            xMax = W;
//            yMin = H;
//            yMax = 0;
//
//            // game loop
//            while (true) {
//                bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
//
//
//                // Write an action using System.out.println()
//                // To debug: System.err.println("Debug messages...");
//
//
//                // the location of the next window Batman should jump to.
//                System.out.println(choiseNextStep(bombDir));
//                lastDir = bombDir;
//            }
//
//        }
//
//        private static String choiseNextStep(String bombDir){
//            String coordinates = "";
//
//            switch(bombDir){
//                case "U":
//                    coordinates=jumpUp();
//                    break;
//                case "UR":
//                    coordinates = jumpUpRigth();
//                    break;
//                case "R":
//                    coordinates = jumpRight();
//                    break;
//                case "DR":
//                    coordinates = jumpDownRight();
//                    break;
//                case "D":
//                    coordinates = jumpDown();
//                    break;
//                case "DL":
//                    coordinates = jumpDownLeft();
//                    break;
//                case "L":
//                    coordinates = jumpLeft();
//                    break;
//                case "UL":
//                    coordinates = jumpUpLeft();
//                    break;
//            }
//            return coordinates;
//        }
//
//        private static String jumpUp(){
//            yMin = Y0;
//            if(false){
//                Y0 -= Math.max((yMin-yMax)/4*3,1);
//            } else{
//                Y0 -= Math.max((yMin-yMax)/2,1);
//            }
//            return String.format("%s %s", X0,Y0);
//        }
//
//        private static String jumpUpRigth(){
//            yMin = Y0;
//            xMin = X0;
//            if(false){
//                Y0 -= Math.max((yMin-yMax)/4*3,1);
//                X0 += Math.max((xMax-xMin)/4*3,1);
//            } else{
//                Y0 -= Math.max((yMin-yMax)/2,1);
//                X0 += Math.max((xMax-xMin)/2,1);
//            }
//
//            return String.format("%s %s", X0,Y0);
//        }
//
//        private static String jumpRight(){
//            xMin =X0;
//            if(false){
//                X0 += Math.max((xMax-xMin)/4*3,1);
//            } else{
//                X0 += Math.max((xMax-xMin)/2,1);
//            }
//            return String.format("%s %s", X0,Y0);
//        }
//
//        private static String jumpDownRight(){
//            yMax = Y0;
//            xMin = X0;
//            if(false){
//                Y0 += Math.max((yMin-yMax)/4*3,1);
//                X0 += Math.max((xMax-xMin)/4*3,1);
//            } else{
//                Y0 += Math.max((yMin-yMax)/2,1);
//                X0 += Math.max((xMax-xMin)/2,1);
//            }
//            return String.format("%s %s", X0,Y0);
//        }
//
//        private static String jumpDown(){
//            yMax = Y0;
//            if(false){
//                Y0 += Math.max((yMin-yMax)/4*3,1);
//            } else {
//                Y0 += Math.max((yMin-yMax)/2,1);
//            }
//            return String.format("%s %s", X0,Y0);
//        }
//
//        private static String jumpDownLeft(){
//            yMax = Y0;
//            xMax = X0;
//            if(false){
//                Y0 += Math.max((yMin-yMax)/4*3,1);
//                X0 -= Math.max((xMax-xMin)/4*3,1);
//            } else{
//                Y0 += Math.max((yMin-yMax)/2,1);
//                X0 -= Math.max((xMax-xMin)/2,1);
//            }
//            return String.format("%s %s", X0,Y0);
//        }
//
//        private static String jumpLeft(){
//            xMax = X0;
//            if(false){
//                X0 -= Math.max((xMax-xMin)/4*3,1);
//            } else{
//                X0 -= Math.max((xMax-xMin)/2,1);
//            }
//            return String.format("%s %s", X0,Y0);
//        }
//
//        private static String jumpUpLeft(){
//            yMin = Y0;
//            xMax = X0;
//            if(isNewDirLikeLastOne()){
//                Y0 -= Math.max((yMin-yMax)/4*3,1);
//                X0 -= Math.max((xMax-xMin)/4*3,1);
//            } else{
//                Y0 -= Math.max((yMin-yMax)/2,1);
//                X0 -= Math.max((xMax-xMin)/2,1);
//            }
//            return String.format("%s %s", X0,Y0);
//        }
//
//        private static boolean isNewDirLikeLastOne(){
//            return lastDir.equals(bombDir);
//        }
//
//    }
//
//}
