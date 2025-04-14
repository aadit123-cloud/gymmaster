import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Entity Classes
class User {
    private int userId;
    private String name;
    private int age;
    private String gender;
    private float weight;
    private float height;
    private Date createdAt;

    // Constructor
    public User(int userId, String name, int age, String gender, float weight, float height) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.createdAt = new Date(); // Current timestamp
    }

    // Getters and setters
    public int getUserId() { return userId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public float getWeight() { return weight; }
    public float getHeight() { return height; }
    public Date getCreatedAt() { return createdAt; }

    public void setWeight(float weight) { this.weight = weight; }
    public void setHeight(float height) { this.height = height; }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", createdAt=" + createdAt +
                '}';
    }
}

class FitnessGoal {
    private int goalId;
    private int userId;
    private String goalType;
    private float targetValue;
    private Date deadline;

    // Constructor
    public FitnessGoal(int goalId, int userId, String goalType, float targetValue, Date deadline) {
        this.goalId = goalId;
        this.userId = userId;
        this.goalType = goalType;
        this.targetValue = targetValue;
        this.deadline = deadline;
    }

    // Getters and setters
    public int getGoalId() { return goalId; }
    public int getUserId() { return userId; }
    public String getGoalType() { return goalType; }
    public float getTargetValue() { return targetValue; }
    public Date getDeadline() { return deadline; }

    @Override
    public String toString() {
        return "FitnessGoal{" +
                "goalId=" + goalId +
                ", userId=" + userId +
                ", goalType='" + goalType + '\'' +
                ", targetValue=" + targetValue +
                ", deadline=" + deadline +
                '}';
    }
}

class WorkoutLog {
    private int workoutId;
    private int userId;
    private String workoutType;
    private float duration;
    private float caloriesBurned;
    private Date date;

    // Constructor
    public WorkoutLog(int workoutId, int userId, String workoutType, float duration, float caloriesBurned, Date date) {
        this.workoutId = workoutId;
        this.userId = userId;
        this.workoutType = workoutType;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
        this.date = date;
    }

    // Getters and setters
    public int getWorkoutId() { return workoutId; }
    public int getUserId() { return userId; }
    public String getWorkoutType() { return workoutType; }
    public float getDuration() { return duration; }
    public float getCaloriesBurned() { return caloriesBurned; }
    public Date getDate() { return date; }

    @Override
    public String toString() {
        return "WorkoutLog{" +
                "workoutId=" + workoutId +
                ", userId=" + userId +
                ", workoutType='" + workoutType + '\'' +
                ", duration=" + duration +
                ", caloriesBurned=" + caloriesBurned +
                ", date=" + date +
                '}';
    }
}

class NutritionLog {
    private int logId;
    private int userId;
    private float caloriesConsumed;
    private float protein;
    private float carbs;
    private float fats;
    private Date date;

    // Constructor
    public NutritionLog(int logId, int userId, float caloriesConsumed, float protein, float carbs, float fats, Date date) {
        this.logId = logId;
        this.userId = userId;
        this.caloriesConsumed = caloriesConsumed;
        this.protein = protein;
        this.carbs = carbs;
        this.fats = fats;
        this.date = date;
    }

    // Getters and setters
    public int getLogId() { return logId; }
    public int getUserId() { return userId; }
    public float getCaloriesConsumed() { return caloriesConsumed; }
    public float getProtein() { return protein; }
    public float getCarbs() { return carbs; }
    public float getFats() { return fats; }
    public Date getDate() { return date; }

    @Override
    public String toString() {
        return "NutritionLog{" +
                "logId=" + logId +
                ", userId=" + userId +
                ", caloriesConsumed=" + caloriesConsumed +
                ", protein=" + protein +
                ", carbs=" + carbs +
                ", fats=" + fats +
                ", date=" + date +
                '}';
    }
}

class ProgressReport {
    private int reportId;
    private int userId;
    private float currentBmi;
    private float weightLoss;
    private float caloriesBurned;
    private Date periodStart;
    private Date periodEnd;

    // Constructor
    public ProgressReport(int reportId, int userId, float currentBmi, float weightLoss, float caloriesBurned, Date periodStart, Date periodEnd) {
        this.reportId = reportId;
        this.userId = userId;
        this.currentBmi = currentBmi;
        this.weightLoss = weightLoss;
        this.caloriesBurned = caloriesBurned;
        this.periodStart = periodStart;
        this.periodEnd = periodEnd;
    }

    // Getters and setters
    public int getReportId() { return reportId; }
    public int getUserId() { return userId; }
    public float getCurrentBmi() { return currentBmi; }
    public float getWeightLoss() { return weightLoss; }
    public float getCaloriesBurned() { return caloriesBurned; }
    public Date getPeriodStart() { return periodStart; }
    public Date getPeriodEnd() { return periodEnd; }

    @Override
    public String toString() {
        return "ProgressReport{" +
                "reportId=" + reportId +
                ", userId=" + userId +
                ", currentBmi=" + currentBmi +
                ", weightLoss=" + weightLoss +
                ", caloriesBurned=" + caloriesBurned +
                ", periodStart=" + periodStart +
                ", periodEnd=" + periodEnd +
                '}';
    }
}

// Main class to manage entities
public class GymMaster {
    private List<User> users;
    private List<FitnessGoal> fitnessGoals;
    private List<WorkoutLog> workoutLogs;
    private List<NutritionLog> nutritionLogs;
    private List<ProgressReport> progressReports;

    public GymMaster() {
        this.users = new ArrayList<>();
        this.fitnessGoals = new ArrayList<>();
        this.workoutLogs = new ArrayList<>();
        this.nutritionLogs = new ArrayList<>();
        this.progressReports = new ArrayList<>();
    }

    // Methods to add data
    public void addUser(User user) {
        this.users.add(user);
    }

    public void addFitnessGoal(FitnessGoal goal) {
        this.fitnessGoals.add(goal);
    }

    public void addWorkoutLog(WorkoutLog log) {
        this.workoutLogs.add(log);
    }

    public void addNutritionLog(NutritionLog log) {
        this.nutritionLogs.add(log);
    }

    public void addProgressReport(ProgressReport report) {
        this.progressReports.add(report);
    }

    // Methods to retrieve data
    public User getUser(int userId) {
        for (User user : users) {
            if (user.getUserId() == userId) {
                return user;
            }
        }
        return null;
    }

    public List<FitnessGoal> getFitnessGoals(int userId) {
        List<FitnessGoal> userGoals = new ArrayList<>();
        for (FitnessGoal goal : fitnessGoals) {
            if (goal.getUserId() == userId) {
                userGoals.add(goal);
            }
        }
        return userGoals;
    }

    public List<WorkoutLog> getWorkoutLogs(int userId) {
        List<WorkoutLog> userLogs = new ArrayList<>();
        for (WorkoutLog log : workoutLogs) {
            if (log.getUserId() == userId) {
                userLogs.add(log);
            }
        }
        return userLogs;
    }

     public List<NutritionLog> getNutritionLogs(int userId) {
        List<NutritionLog> userLogs = new ArrayList<>();
        for (NutritionLog log : nutritionLogs) {
            if (log.getUserId() == userId) {
                userLogs.add(log);
            }
        }
        return userLogs;
    }

    public List<ProgressReport> getProgressReports(int userId) {
        List<ProgressReport> userReports = new ArrayList<>();
        for (ProgressReport report : progressReports) {
            if (report.getUserId() == userId) {
                userReports.add(report);
            }
        }
        return userReports;
    }

    // Main method for testing
    public static void main(String[] args) {
        GymMaster gym = new GymMaster();

        // Create users
        User user1 = new User(1, "John Doe", 30, "Male", 85.5f, 180.0f);
        User user2 = new User(2, "Jane Smith", 25, "Female", 60.2f, 165.5f);

        gym.addUser(user1);
        gym.addUser(user2);

        // Create fitness goals
        Date deadline1 = new Date(); // Default to now, should be set properly
        Date deadline2 = new Date(); // Default to now, should be set properly

        FitnessGoal goal1 = new FitnessGoal(101, 1, "Weight Loss", 75.0f, deadline1);
        FitnessGoal goal2 = new FitnessGoal(102, 2, "Muscle Gain", 55.0f, deadline2);

        gym.addFitnessGoal(goal1);
        gym.addFitnessGoal(goal2);

        // Retrieve and print user data
        User retrievedUser = gym.getUser(1);
        System.out.println("Retrieved User: " + retrievedUser);

        // Retrieve and print fitness goals for a user
        List<FitnessGoal> userGoals = gym.getFitnessGoals(1);
        System.out.println("Fitness Goals for User 1: " + userGoals);
    }
}
