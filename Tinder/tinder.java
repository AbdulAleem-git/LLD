import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class User {
    private String id;
    private String name;
    private List<String> pictures;
    private String Location;
    private int radius;

    User() {
    }

    public String getId() {
        return id;
    }

    public void changeRadius(int radius) {
        this.radius = radius;
    }

}

class System {
    List<User> users;
    Map<String, List<Match>> matches;
    Map<String, Swipe> leftSwipe;
    Map<String, Swipe> rightSwipe;
    Map<String, List<User>> suggestions;

    List<User> recommend(User user) {
        List<User> userList = suggestions.get(user.getId()).stream().limit(5).collect(Collectors.toList());
        suggestions.get(user.getId()).subList(0, 5).clear();
        return userList;
    }

    void changeRadius(User user, int radius) {
        user.changeRadius(radius);
        List<User> newSuggestions;
        for (int i = 0; i < users.size(); i++) {
            if (leftSwipe.get(user.getId()).hasSwiped(users.get(i)) ||
                    rightSwipe.get(user.getId()).hasSwiped(users.get(i))) {
                continue;
            }
            if (users.get(i).getlocation - user.getLocation < radius) {
                newSuggestions.add(users.get(i));
            }
            suggestions.replace(user.getId(), newSuggestions);
            return;
        }
    }

    void swipeRight(User a , User b){
        rightSwipe.get(a.getId()).addToSwipe(b);
        if(/* check if swiped right by b */)
        {
            Match match = new Match(a, b);
            matches.get(a.getId()).add(match);
            matches.get(b.getId()).add(match);
        }
    }

    void swipeLeft(User a, User b) {
        leftSwipe.get(a.getId()).addToSwipe(b);
        return;
    }

}

class Match {
    private String id;
    User a;
    User b;
    List<Chat> chats;

    void addChat(Chat Chat) {
        chats.add(Chat);
    }
}

class Chat {
    User sender;
    String description;
}

class Swipe {
    Map<String , User> users;
    void addToSwipe(User user){};
    boolean checkIfSwiped(User user){return true};
}
