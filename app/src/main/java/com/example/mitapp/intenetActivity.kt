package com.example.mitapp

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat


lateinit var Buttonsms:Button
lateinit var Buttonemail:Button
lateinit var Buttoncamera:Button
lateinit var Buttonmpesa:Button
lateinit var Buttonshare:Button
lateinit var Buttoncall:Button
lateinit var Buttondial:Button


class IntenetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intenet)

        Buttonsms=findViewById(R.id.btn_sms)
        Buttonemail=findViewById(R.id.btn_email)
        Buttoncamera=findViewById(R.id.btn_camera)
        Buttonmpesa=findViewById(R.id.btn_stk)
        Buttonshare=findViewById(R.id.btn_share)
        Buttoncall=findViewById(R.id.btn_call)
        Buttondial=findViewById(R.id.btn_dial)

        Buttonsms.setOnClickListener{
            val uri = Uri.parse("smsto:0799658182")

            val intent = Intent(Intent.ACTION_SENDTO, uri)

            intent.putExtra("Hello", "How is the weather today")

            startActivity(intent)

        }

        Buttoncamera.setOnClickListener{
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            startActivityForResult(takePictureIntent, 1)

        }

        Buttoncall.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "0799658182"))

            if (ContextCompat.checkSelfPermission(
                    this@IntenetActivity,
                    Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this@IntenetActivity,
                    arrayOf(Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                startActivity(intent)
            }

        }
        Buttondial.setOnClickListener {
            val phone = "0799658182"

            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

            startActivity(intent)

        }


            Buttonemail.setOnClickListener {
                val emailIntent =
                    Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "veronicagitau56@gmail.com", null))

                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

            }

            Buttonshare.setOnClickListener {
                val shareIntent = Intent(Intent.ACTION_SEND)

                shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

                shareIntent.type = "text/plain"

                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

                startActivity(shareIntent)

            }

            Buttonmpesa.setOnClickListener {
                val simToolKitLaunchIntent =
                    applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

                simToolKitLaunchIntent?.let { startActivity(it) }


            }

        }

}