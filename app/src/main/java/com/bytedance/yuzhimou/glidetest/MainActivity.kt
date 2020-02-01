package com.bytedance.yuzhimou.glidetest

import android.graphics.Bitmap
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation
import com.bytedance.yuzhimou.glidetest.Utils.ImageUtils
import com.bytedance.yuzhimou.glidetest.transforms.CircleTransformation
import java.security.MessageDigest

class MainActivity : AppCompatActivity() {
    lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById<ImageView>(R.id.iv_image)
        Glide.with(this).load(ImageUtils.IMAGE_FROM_URL)
            .dontAnimate()
            .placeholder(R.drawable.ic_launcher_foreground)
            .error(R.drawable.ic_launcher_background)
            .thumbnail(0.2f)
            .skipMemoryCache(true)
            .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
            .priority(Priority.HIGH)
            .transform(CircleTransformation())      //覆盖操作
            .into(imageView)
    }
}
