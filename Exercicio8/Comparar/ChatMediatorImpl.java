package Comparar;
import java.util.ArrayList;
import java.util.List;
//mediador concreto
public class ChatMediatorImpl implements ChatMediator
{

  private List<User> users;
    //construtor
  public ChatMediatorImpl()
  {
    this.users = new ArrayList<User>();
  }

  @Override
  public void addUser( User user )
  {
    this.users.add(user);
  }

  @Override
  public void sendMessage( String message, User user )
  {
    for( User u : this.users )
    {
      // Message should not be received by the user who is sending it
      if( u != user )
      {
        u.receive(message);
      }
    }
  }

}