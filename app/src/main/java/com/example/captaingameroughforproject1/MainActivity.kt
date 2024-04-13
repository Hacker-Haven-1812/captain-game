package com.example.captaingameroughforproject1

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.captaingameroughforproject1.ui.theme.CaptainGameRoughForProject1Theme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaptainGameRoughForProject1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CaptainGame()
                }
            }
        }
    }
    @Composable
    fun CaptainGame(){
        val tresuresFound = remember { mutableStateOf(0)}
        val direction = remember {mutableStateOf("North") }
        val stromOrTreasure = remember {
            mutableStateOf("Depends on you luck!")
        }

        Column (Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
            Text(text = "Captain Game")
            Spacer(modifier = Modifier.height(30.dp))
            Text(text = "Hint!!")
            Text(text = "here you only need to click the direction button , if you Treasures Found is increased by 1 then you won else TRY AGAIN")
            Spacer(modifier = Modifier.height(30.dp))
            Text(text = "Treasures Found : ${tresuresFound.value}")
            Spacer(modifier = Modifier.height(30.dp))
            Text(text = "Storm Or Treasure :  ${stromOrTreasure.value}")
            Spacer(modifier = Modifier.height(30.dp))
            Text(text = "Treasures Found : ${direction.value}")
            Spacer(modifier = Modifier.height(30.dp))
            Button(onClick = { direction.value = "East"
            if(Random.nextBoolean()){

                tresuresFound.value +=1
                stromOrTreasure.value = "Found a Treasure!"
                Toast.makeText(applicationContext,
                    "YOU WON" ,
                    Toast.LENGTH_SHORT).show()
            }else{
                    Toast.makeText(applicationContext,
                    "TRY AGAIN" ,
                    Toast.LENGTH_SHORT  ).show()
                stromOrTreasure.value = "Storm Ahead!"
            }



            }) {
                Text(text = "Sale East")

            }
            Button(onClick = {  direction.value = "West"
                if(Random.nextBoolean()){

                    tresuresFound.value +=1
                    stromOrTreasure.value = "Found a Treasure!"
                    Toast.makeText(applicationContext,
                        "YOU WON" ,
                        Toast.LENGTH_SHORT  ).show()
                }else{
                    Toast.makeText(applicationContext,
                    "TRY AGAIN" ,
                    Toast.LENGTH_SHORT  ).show()
                    stromOrTreasure.value = "Storm Ahead!"

                }




            }) {
                Text(text = "Sale West")

            }
            Button(onClick = {direction.value = "North"
                if(Random.nextBoolean()){

                    tresuresFound.value +=1
                    stromOrTreasure.value = "Found a Treasure!"
                    Toast.makeText(applicationContext,
                        "YOU WON" ,
                        Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(applicationContext,
                        "TRY AGAIN" ,
                        Toast.LENGTH_SHORT  ).show()
                    stromOrTreasure.value = "Storm Ahead!"
                }



            }) {
                Text(text = "Sale North")

            }
            Button(onClick = { direction.value = "South"
                if(Random.nextBoolean()){

                    tresuresFound.value +=1
                    stromOrTreasure.value = "Found a Treasure!"
                    Toast.makeText(applicationContext,
                        "YOU WON" ,
                        Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(applicationContext,
                        "TRY AGAIN" ,
                        Toast.LENGTH_SHORT  ).show()
                    stromOrTreasure.value = "Storm Ahead!"
                }



            }) {
                Text(text = "Sale South")
                

            }
            Text(text = "ALL RIGHT RESERVED")
            Text(text = "MADE BY : Ankush")


        }
    }
}

