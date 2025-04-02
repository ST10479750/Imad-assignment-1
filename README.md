# Meal Suggester App

Meal Suggester App helps users find something to eat based on the time of day in a fun and interactive way.

## Features
- Allows user input.
- Appealing background.
- Offers a variety of meals.
- Displays meal name with meal type (e.g., **Breakfast: Eat some eggs!**).
- Handles errors to ensure valid inputs.
- Uses toast messages for invalid input feedback.
- Includes a **Reset** button for reuse.

---

## How Was The App Developed?
This app was built using:
- **Android Studio** (Development Environment)
- **Kotlin** (Programming Language)
- **Bluestacks** (Emulator for testing)
- Background image sourced from Google.
- Additional coding references from YouTube (*links provided at the end*).

---

## Installation Guide
### **Requirements:**
- Android Studio
- Internet Connection
- GitHub

### **Steps to Install:**
1. Clone or download the code from the repository.
   ```sh
   git clone https://github.com/yourusername/meal-suggester-app.git
   ```
2. Open the project in **Android Studio**.
3. Allow **Gradle** to sync.
4. Run the app using an emulator (e.g., Bluestacks).

---

## How To Use The App
1. Open the app.
2. Tap the field that says **"Example: Morning, Afternoon"**.
3. Enter the time of day.
4. Click the **"Suggest Meal"** button.
5. The meal suggestion will be displayed.
6. Click **"Reset"** to use the app again.

---

## Automated Testing Using GitHub Actions
This app has been integrated with **GitHub Actions** to enable automatic testing, making it easier for users. The setup includes:
- **Unit Testing**
- **Instrumented Testing**
- **Build Verification**

### **Setup of the Workflow**
On every **push** or **pull request**, a workflow is triggered.
The workflow file is located at:
```
.github/workflows/android-ci.yml
```

🔗 **YouTube Video**: [GitHub Actions for Android](https://youtu.be/s4gVEFLvBbc)

---

## 🔧 Possible Future Improvements
- Add images of foods when displayed.
- Expand meal options for greater variety.
- Integrate AI for a more personalized experience.
- Include default images for offline usage.

---

## References
- **Title:** ListOf() in Kotlin with Example  
  **Author:** TechBrainster  
  **Date:** 1 April 2025  
  **Version:** 1.0  
  **Available:** [YouTube](https://www.youtube.com/watch?v=NuhDgKOGiNY)

- **Title:** Kotlin If ... Else  
  **Author:** w3schools  
  **Date:** 1 April 2025  
  **Version:** 1.0  
  **Available:** [w3schools](https://www.w3schools.com/kotlin/kotlin_conditions.php)

- **Title:** How to create a Custom Toast Message in Android Studio (Kotlin 2020)  
  **Author:** Idently  
  **Date:** 1 April 2025  
  **Version:** 1.0  
  **Available:** [YouTube](https://www.youtube.com/watch?v=WSx2a99kPY4)

---

 *Feel free to contribute to this project by forking the repository and submitting pull requests!*

