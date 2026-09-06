class Team {
    String collegeName;
    String teamName;
    final String MOTTO = "we win every rbu match!";

    Team(String collegeName, String teamName) {
        this.collegeName = collegeName;
        this.teamName = teamName;
    }

    String getCollegeName() {
        return collegeName;
    }

    String getTeamName() {
        return teamName;
    }

    String getMotto() {
        return MOTTO;
    }
}

class CricketTeam extends Team {
    int totalRunsScored;
    int matchesPlayed;

    CricketTeam(String collegeName, String teamName, int totalRunsScored, int matchesPlayed) {
        super(collegeName, teamName);
        this.totalRunsScored = totalRunsScored;
        this.matchesPlayed = matchesPlayed;
    }

    double calculateAverageRunsPerMatch() {
        return (double) totalRunsScored / matchesPlayed;
    }
}

class FootballTeam extends Team {
    int goalsScored;
    int matchesPlayed;

    FootballTeam(String collegeName, String teamName, int goalsScored, int matchesPlayed) {
        super(collegeName, teamName);
        this.goalsScored = goalsScored;
        this.matchesPlayed = matchesPlayed;
    }

    double calculateGoalAverage() {
        return (double) goalsScored / matchesPlayed;
    }
}
