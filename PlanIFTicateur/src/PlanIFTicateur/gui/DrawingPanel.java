/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlanIFTicateur.gui;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.Serializable;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 *
 * @author Alexandre
 */
public class DrawingPanel extends JPanel implements Serializable
{
    public Dimension initialDimension;
    private MainWindow mainWindow;
    
    public DrawingPanel()
    {
    }
    
    public DrawingPanel(MainWindow mainWindow)
    {
        this.mainWindow = mainWindow;
        setBorder( new javax.swing.border.BevelBorder(BevelBorder.LOWERED));
        int width = (int) (java.awt.Toolkit.getDefaultToolkit().getScreenSize().width);
        int height = (int) (java.awt.Toolkit.getDefaultToolkit().getScreenSize().height);
        
        setPreferredSize(new Dimension(width/2,height/2));
        setVisible(true);
        
        initialDimension = new Dimension(width/2, height/2);
    }
    
    protected void paintComponenet(Graphics g)
    {
        if(mainWindow != null)
        {
            super.paintComponent(g);
            //PAS FINI
        }
    }
    public MainWindow getMainWindow()
    {
        return mainWindow;
    }
    public void setMainWindow(MainWindow mainWindow)
     {
         this.mainWindow = mainWindow;
     }
 
     public Dimension getInitialDimension()
     {
         return initialDimension;
     }
 
     public void setInitialDimension()
     {
     }
}
