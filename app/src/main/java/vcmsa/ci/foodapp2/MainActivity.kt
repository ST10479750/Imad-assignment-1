package vcmsa.ci.foodapp2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // UI Elements
        val timeInput = findViewById<EditText>(R.id.timeInput)
        val suggestButton = findViewById<Button>(R.id.suggestButton)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val resultTxt = findViewById<TextView>(R.id.resultTxt)

        // Meal suggestions
        val breakfastMeals = listOf("Have Some Eggs", "Make some Pancakes") // List Of Foods
        val midMorningMeals = listOf("Eat a Fruit", "Have some Yogurt") // List Of Foods
        val lunchMeals = listOf("Make A Sandwich", "Eat A Salad") // List Of Foods
        val afternoonSnackMeals = listOf("Have Some Cake", "Have Some Cookies With Milk") // List Of Foods
        val dinnerMeals = listOf("Have A Grilled Fish", "Chow Some Pasta") // List Of Foods
        val afterDinnerMeals = listOf("Eat Ice Cream", "Have A Fruit Salad") // List Of Foods

        //Title: ListOf() in kotlin with example
        //Author: TechBrainster
        //Date: 1 April 2025
        //Version: 1.0
        //Available: https://www.youtube.com/watch?v=NuhDgKOGiNY


        // Code To Make Button Functional When Clicked
        suggestButton.setOnClickListener {
            val time = timeInput.text.toString().trim().lowercase()
            var mealType = ""
            var mealName = ""

            // Code for meal selection
            if (time == "morning") {
                mealType = "Breakfast"
                mealName = breakfastMeals[Random.nextInt(breakfastMeals.size)] //Chooses A Meal

            } else if (time == "mid-morning") {
                mealType = "Mid-Morning Snack"
                mealName = midMorningMeals[Random.nextInt(midMorningMeals.size)] //Chooses A Meal


            } else if (time == "afternoon") {
                mealType = "Lunch"
                mealName = lunchMeals[Random.nextInt(lunchMeals.size)] //Chooses A Meal


            } else if (time == "mid-afternoon") {
                mealType = "Afternoon Snack"
                mealName = afternoonSnackMeals[Random.nextInt(afternoonSnackMeals.size)] //Chooses A Meal

            } else if (time == "dinner") {
                mealType = "Dinner"
                mealName = dinnerMeals[Random.nextInt(dinnerMeals.size)] //Chooses A Meal

            } else if (time == "after dinner") {
                mealType = "After Dinner"
                mealName = afterDinnerMeals[Random.nextInt(afterDinnerMeals.size)] //Chooses A Meal

            } else {
                showToast("Enter: Morning, Mid-morning, Afternoon, Mid-afternoon, Dinner, or After Dinner.")
            }

            // Display results if valid meal is selected
            if (mealType.isNotEmpty() && mealName.isNotEmpty()) {
                resultTxt.text = "$mealType: $mealName" // Displays Meal Type And Meal Name

                //Title: Kotlin If ... Else
                //Author: w3schools
                //Date: 1 April 2025
                //Version: 1.0
                //Available: https://www.w3schools.com/kotlin/kotlin_conditions.php

            }
        }

        // Reset Button
        resetButton.setOnClickListener {
            timeInput.text.clear() // Clear the input field
            resultTxt.text = ""  // Clear the result field
            showToast("Reset Enabled") // Shows Reset Message
        }
    }


    // Displays The Toast Message
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        //Title: How to create a Custom Toast Message in Android Studio (Kotlin 2020)
        //Author: Idently
        //Date: 1 April 2025
        //Version: 1.0
        //Available: https://www.youtube.com/watch?v=WSx2a99kPY4

    }
}