package com.bytedance.yuzhimou.glidetest.transforms

import android.graphics.Bitmap
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation
import java.security.MessageDigest

/**
 * Created by yuzhimou on 2020-02-01
 */
class CircleTransformation :BitmapTransformation(){
    override fun updateDiskCacheKey(messageDigest: MessageDigest) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun transform(
        pool: BitmapPool,
        toTransform: Bitmap,
        outWidth: Int,
        outHeight: Int
    ): Bitmap {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}