package iluvus.backend.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Document(collection = "interests")
public class InterestTopic {

    @Id
    private int id;

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public HashMap<Integer, String> getInterestTopic() {
        // get all interest topics
        HashMap<Integer, String> interestTopicMap = new HashMap<>();
        interestTopicMap.put(this.getId(), this.getName());
        return interestTopicMap;
    }

    public static final List<String> topicList = Arrays.asList(
                "Tech Innovation",
                "College Tips",
                "LGBTQIA Rights",
                "Gender Equality",
                "Political Updates",
                "Racial Justice",
                "Online Communities",
                "Sustainable Tourism",
                "Global Relations",
                "Artificial Intelligence",
                "Campus Diversity",
                "LGBTQIA History",
                "Digital Privacy",
                "Cultural Exchange",
                "Gadgets Reviews",
                "Financial Aid",
                "Media Representation",
                "Social Justice",
                "Activism Events",
                "Race Dialogues",
                "Online Learning",
                "Travel Tips",
                "Economic Trends",
                "Data Privacy",
                "Study Abroad",
                "Health & Wellness",
                "Tech Diversity",
                "Civic Engagement",
                "Anti-Racism",
                "Cybersecurity",
                "Sustainability",
                "Support Groups",
                "Election Integrity",
                "Diversity Workshops",
                "Safety Measures",
                "Legal Rights",
                "Conservation Efforts",
                "Human Rights",
                "Entrepreneurship",
                "Pride Events",
                "Equal Pay",
                "Political Debates",
                "Ethnicity Studies",
                "Social Trends",
                "Nomad Lifestyle",
                "Citizenship Ed.",
                "Tech Ethics",
                "Diversity Reports",
                "Leadership Programs",
                "Community Forums",
                "Refugee Rights",
                "Activism Campaigns",
                "Development Goals",
                "Communication",
                "Industry Reports",
                "Leadership",
                "Cultural Festivals",
                "News Analysis",
                "Discrimination",
                "Tech Forums",
                "Learning",
                "Travel Destinations",
                "Trade Agreements",
                "Emerging Trends",
                "Career Services",
                "Parenting Support",
                "Health Initiatives",
                "Influence",
                "Protections",
                "Bullying",
                "Safe Spaces",
                "Humanitarian Aid",
                "Privacy Protection",
                "Sustainability",
                "Diplomacy Talks",
                "Social Good",
                "Activism",
                "Cultural Heritage",
                "Rights Movements",
                "Moderation",
                "Development",
                "Diplomacy",
                "Accessibility",
                "Mentorship",
                "Visibility",
                "Justice Advocacy",
                "Virtual Exchanges",
                "Migration Policies",
                "Accessibility",
                "Volunteer Opportunities",
                "Workplace Equality",
                "Justice Forums",
                "Safety Guidelines",
                "Impact Assessments",
                "Humanitarian Aid",
                "Policy Debates",
                "Government Elections",
                "Youth Empowerment",
                "Heritage Preservation",
                "Cyberbullying Prevention",
                "Healthy Eating Tips",
                "Current Events Analysis",
                "Movie Reviews",
                "Book Recommendations",
                "Positive Affirmations",
                "Mental Wellness Practices",
                "Community Engagement",
                "Food Sustainability",
                "Global Awareness",
                "Cyber Safety Measures",
                "Culinary Arts Inspiration",
                "World News Updates",
                "Film Industry Trends",
                "Literary Discussions",
                "Inspirational Quotes",
                "Self-Care Strategies",
                "Social Impact Initiatives",
                "Plant-Based Recipes",
                "Crisis Response Resources",
                "Film Festivals",
                "Literary Classics",
                "Motivational Stories",
                "Community Building Activities",
                "Farm-to-Table Movement",
                "Humanitarian Efforts",
                "Disaster Relief Efforts",
                "Movie Recommendations",
                "Fictional Worlds Exploration",
                "Gratitude Practices",
                "Volunteer Opportunities",
                "Nutrition Education",
                "Global Awareness Campaigns",
                "Film Industry News",
                "Author Spotlights",
                "Acts of Kindness",
                "Online Safety Tips",
                "Culinary Adventures",
                "World Affairs Updates",
                "Movie Trivia",
                "Reading Challenges",
                "Positivity Challenges",
                "Mental Health Resources",
                "Charity Fundraising Events",
                "Foodie Destinations",
                "Global Crisis Awareness",
                "Movie Premieres",
                "Virtual Book Clubs",
                "Self-Improvement Tips",
                "Random Acts of Kindness",
                "Online Friendship Building",
                "Culinary Techniques",
                "Social Justice Discussions",
                "Film Recommendations",
                "Literary Events",
                "Daily Inspiration",
                "Self-Reflection Prompts",
                "Environmental Activism",
                "Cooking Demonstrations",
                "Humanitarian Aid Updates",
                "Movie Soundtrack Reviews",
                "Genre Appreciation",
                "Uplifting News Stories",
                "Mindfulness Practices",
                "Cooking Challenges",
                "International Relations Analysis",
                "Film Production Insights",
                "Book Releases",
                "Optimism Boosters",
                "Online Privacy Awareness",
                "Healthy Recipe Ideas",
                "Global Development Updates",
                "Movie Memorabilia Collections",
                "Literary Inspirations",
                "Kindness Initiatives",
                "Cooking Experiments",
                "Environmental Conservation Tips",
                "Movie Marathon Suggestions",
                "Book Adaptation Reviews",
                "Empowerment Challenges",
                "Online Safety Awareness",
                "Healthy Eating Habits",
                "Global Crisis Response Efforts",
                "Movie Critiques",
                "Literary Analysis",
                "Community Service Projects",
                "Food Blogging Tips",
                "Social Media Trends",
                "Literature Reviews",
                "Daily Positivity Quotes",
                "Online Support Groups",
                "Sustainable Food Choices",
                "Humanitarian Relief Efforts",
                "Film Theory Discussions",
                "Bookworm Recommendations",
                "Acts of Gratitude",
                "Friendship Appreciation",
                "Virtual Cooking Classes",
                "Environmental Sustainability Projects",
                "Movie Recommendations",
                "Book Recommendations",
                "Other"
        );





}
