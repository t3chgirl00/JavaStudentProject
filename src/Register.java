import java.util.*;
import java.util.stream.Collectors;

public class Register {
    private final List<INameable> persons;

    public Register(List<INameable> students) {
        persons = students;
    }

    public List<String> getRegister() {
        List<String> names = new ArrayList<>();
        for (INameable person : this.persons) {
            names.add(person.getName());
        }
        return Arrays.asList(names.toString());
    }


    public List<String> getRegisterByLevel(Level level) {
        List<String> peopleByLevel = this.persons.stream().filter(x -> ((Student) x).getLevel() == level)
                .map(INameable::getName).collect(Collectors.toList());
        return peopleByLevel;
    }


    public void printReport() {
        Map<Level, List<String>> sortedLevels = new HashMap<>();
//        sortedLevels.put(Level.LEVEL1, this.getRegisterByLevel(Level.LEVEL1));
        for (INameable p : this.persons) {
            Level l = ((HasLevel) p).getLevel();
            if (sortedLevels.containsKey(l)) {
                List<String> names = sortedLevels.get(l);
                names.add(p.getName());
            } else {
                List<String> names = new ArrayList<>();
                names.add(p.getName());
                sortedLevels.put(l, names);
            }
        }
        System.out.println(sortedLevels.toString().replace("{", "").replace("}", ""));



    }

    @Override
    public String toString() {
        return "Register \n"
                + persons;
    }
}
