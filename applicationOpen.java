/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startuppcassistant;

import java.io.IOException;

/**
 *
 * @author Peter McLane
 */
class applicationOpen {
    public static void calculatorApp(){
        try
        {
                String commandArr[] = {"c:/Windows/System32/calc.exe"};
                Runtime runtimeObj = Runtime.getRuntime();
                runtimeObj.exec(commandArr);
            }
            catch(IOException ie)
            {
            }
            
        }
    public static void notepadApp(){
        try
        {
                String commandArr[] = {"c:/Windows/System32/notepad.exe"};
                Runtime runtimeObj = Runtime.getRuntime();
                runtimeObj.exec(commandArr);
            }
            catch(IOException ie)
            {
            }
    }
    public static void mediaplayerApp(){
        try
        {
                String commandArr[] = {"c:/Windows/System32/dvdplay.exe"};
                Runtime runtimeObj = Runtime.getRuntime();
                runtimeObj.exec(commandArr);
            }
            catch(IOException ie)
            {
            }
    }
    public static void mspaint(){
        try
        {
                String commandArr[] = {"c:/Windows/System32/mspaint.exe"};
                Runtime runtimeObj = Runtime.getRuntime();
                runtimeObj.exec(commandArr);
            }
            catch(IOException ie)
            {
            }
    }
    public static void msword(){
        try
        {
                String commandArr[] = {"c:/Program Files (x86)/Microsoft Office/root/office16/WINWORD.EXE"};
                Runtime runtimeObj = Runtime.getRuntime();
                runtimeObj.exec(commandArr);//"C:\Program Files (x86)\Microsoft Office\root\Office16\WINWORD.EXE"
            }
            catch(IOException ie)
            {
            }
    }
    
    
    
    
    
    
    
            
        }

    

