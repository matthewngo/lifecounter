package edu.washington.mvn3.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val p1Text: TextView = findViewById(R.id.p1Text)
        val p2Text: TextView = findViewById(R.id.p2Text)
        val p3Text: TextView = findViewById(R.id.p3Text)
        val p4Text: TextView = findViewById(R.id.p4Text)
        val resultText: TextView = findViewById(R.id.resultText)


        // P1 BUTTONS
        val p1minus1 = findViewById<Button>(R.id.p1minus1)
        p1minus1.setOnClickListener{
            var amt = p1Text.text.toString().toInt()
            if (amt > 0) {
                amt = amt - 1
            }
            p1Text.text = amt.toString()
        }

        val p1minus5 = findViewById<Button>(R.id.p1minus5)
        p1minus5.setOnClickListener{
            var amt = p1Text.text.toString().toInt()
            if (amt > 4) {
                amt = amt - 5
            } else {
                amt = 0
            }
            p1Text.text = amt.toString()
        }

        val p1plus1 = findViewById<Button>(R.id.p1plus1)
        p1plus1.setOnClickListener{
            var amt = p1Text.text.toString().toInt()
            amt = amt + 1
            p1Text.text = amt.toString()
        }

        val p1plus5 = findViewById<Button>(R.id.p1plus5)
        p1plus5.setOnClickListener{
            var amt = p1Text.text.toString().toInt()
            amt = amt + 5
            p1Text.text = amt.toString()
        }

        // P2 BUTTONS
        val p2minus1 = findViewById<Button>(R.id.p2minus1)
        p2minus1.setOnClickListener{
            var amt = p2Text.text.toString().toInt()
            if (amt > 0) {
                amt = amt - 1
            }
            p2Text.text = amt.toString()
        }

        val p2minus5 = findViewById<Button>(R.id.p2minus5)
        p2minus5.setOnClickListener{
            var amt = p2Text.text.toString().toInt()
            if (amt > 4) {
                amt = amt - 5
            } else {
                amt = 0
            }
            p2Text.text = amt.toString()
        }

        val p2plus1 = findViewById<Button>(R.id.p2plus1)
        p2plus1.setOnClickListener{
            var amt = p2Text.text.toString().toInt()
            amt = amt + 1
            p2Text.text = amt.toString()
        }

        val p2plus5 = findViewById<Button>(R.id.p2plus5)
        p2plus5.setOnClickListener{
            var amt = p2Text.text.toString().toInt()
            amt = amt + 5
            p2Text.text = amt.toString()
        }

        // P3 BUTTONS
        val p3minus1 = findViewById<Button>(R.id.p3minus1)
        p3minus1.setOnClickListener{
            var amt = p3Text.text.toString().toInt()
            if (amt > 0) {
                amt = amt - 1
            }
            p3Text.text = amt.toString()
        }

        val p3minus5 = findViewById<Button>(R.id.p3minus5)
        p3minus5.setOnClickListener{
            var amt = p3Text.text.toString().toInt()
            if (amt > 4) {
                amt = amt - 5
            } else {
                amt = 0
            }
            p3Text.text = amt.toString()
        }

        val p3plus1 = findViewById<Button>(R.id.p3plus1)
        p3plus1.setOnClickListener{
            var amt = p3Text.text.toString().toInt()
            amt = amt + 1
            p3Text.text = amt.toString()
        }

        val p3plus5 = findViewById<Button>(R.id.p3plus5)
        p3plus5.setOnClickListener{
            var amt = p3Text.text.toString().toInt()
            amt = amt + 5
            p3Text.text = amt.toString()
        }

        // P4 BUTTONS
        val p4minus1 = findViewById<Button>(R.id.p4minus1)
        p4minus1.setOnClickListener{
            var amt = p4Text.text.toString().toInt()
            if (amt > 0) {
                amt = amt - 1
            }
            p4Text.text = amt.toString()
        }

        val p4minus5 = findViewById<Button>(R.id.p4minus5)
        p4minus5.setOnClickListener{
            var amt = p4Text.text.toString().toInt()
            if (amt > 4) {
                amt = amt - 5
            } else {
                amt = 0
            }
            p4Text.text = amt.toString()
        }

        val p4plus1 = findViewById<Button>(R.id.p4plus1)
        p4plus1.setOnClickListener{
            var amt = p4Text.text.toString().toInt()
            amt = amt + 1
            p4Text.text = amt.toString()
        }

        val p4plus5 = findViewById<Button>(R.id.p4plus5)
        p4plus5.setOnClickListener{
            var amt = p4Text.text.toString().toInt()
            amt = amt + 5
            p4Text.text = amt.toString()
        }

        // RESULT CASE
        p1Text.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable) {
                if (p1Text.text.toString().toInt() == 0) {
                    resultText.text = "Player 1 LOSES!"
                }
            }

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {

            }
        })

        p2Text.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable) {
                if (p2Text.text.toString().toInt() == 0) {
                    resultText.text = "Player 2 LOSES!"
                }
            }

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {

            }
        })

        p3Text.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable) {
                if (p3Text.text.toString().toInt() == 0) {
                    resultText.text = "Player 3 LOSES!"
                }
            }

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {

            }
        })

        p4Text.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable) {
                if (p4Text.text.toString().toInt() == 0) {
                    resultText.text = "Player 4 LOSES!"
                }
            }

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {

            }
        })

    }
}
