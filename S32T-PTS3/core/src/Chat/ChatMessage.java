/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;

import com.badlogic.gdx.graphics.Color;
import java.util.Date;

/**
 * @author Marouan Bakour
 * @author Milton van de Sanden
 */
public class Chatmessage
{
    private String playername;
    private String Message;
            private Color color;
                    
    private Date MessageDate;

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playerName) {
        this.playername = playerName;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

  

    public Date getMessageDate() {
        return MessageDate;
    }

    public void setMessageDate(Date MessageDate) {
        this.MessageDate = MessageDate;
    }

    
    
    public Chatmessage(String message, String playername, Color color)
    {
        this.Message = message;
        this.playername = playername;
      this.color = color;
    }
    
   
}
