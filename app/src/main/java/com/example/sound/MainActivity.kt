package com.example.sound

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ドラムのサウンドファイルを読み込んで、プレイヤーをつくる
        val drumSound = MediaPlayer.create(this,R.raw.drum_sound)

       drumImage.setOnTouchListener { view, event ->

           //タッチが始まったときに
           if(event.action == MotionEvent.ACTION_DOWN){

               //ドラムが鳴っている画像に切り替える
               drumImage.setImageResource(R.drawable.drum_playing_image)

               //ドラムの音を巻き戻す
               drumSound.seekTo(0)

               //ドラムの音を再生する
               drumSound.start()
           }

           //タッチが終わるときに
           else if(event.action == MotionEvent.ACTION_UP){

               drumImage.setImageResource(R.drawable.drum_image)
           }

           else if(event.action == MotionEvent.ACTION_UP){

               drumImage.setImageResource(R.drawable.drum_image)
           }
           true
       }

        //ピアノのサウンドファイルを読み込んでプレイヤーをつくる
        val pianoSound = MediaPlayer.create(this,R.raw.piano_sound)

        //ピアノがタッチされた時に呼ばれる
        pianoImage.setOnTouchListener{view, event ->

            //タッチが始まった時に
            if(event.action ==MotionEvent.ACTION_DOWN){

                //ピアノが鳴っている画像に切り替える
                pianoImage.setImageResource(R.drawable.piano_playing_image)

                //ピアノの音を巻き戻す
                pianoSound.seekTo(0)

                //ピアノの音を再生する
                pianoSound.start()
            }
            else if (event.action == MotionEvent.ACTION_UP){

                //ピアノが鳴っていない画像に切り替える
                pianoImage.setImageResource(R.drawable.piano_image)
            }

            true
        }

        //ギターのサウンドファイルを読み込んでプレイヤーをつくる
        val guitarSound = MediaPlayer.create(this,R.raw.guitar_sound)

        //ピアノがタッチされた時に呼ばれる
        guitarImage.setOnTouchListener{view, event ->

            //タッチが始まった時に
            if(event.action ==MotionEvent.ACTION_DOWN){

                //ピアノが鳴っている画像に切り替える
                guitarImage.setImageResource(R.drawable.guitar_playing_image)

                //ピアノの音を巻き戻す
                guitarSound.seekTo(0)

                //ピアノの音を再生する
                guitarSound.start()
            }
            else if (event.action == MotionEvent.ACTION_UP){

                //ピアノが鳴っていない画像に切り替える
                guitarImage.setImageResource(R.drawable.guitar_image)
            }

            true
        }
    }
}