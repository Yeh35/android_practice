package com.yeh35.practice.android.camerabarcode

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.graphics.SurfaceTexture
import android.hardware.camera2.CameraCharacteristics
import android.hardware.camera2.CameraManager
import android.os.Bundle
import android.view.SurfaceView
import androidx.appcompat.app.AppCompatActivity
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageProxy
import androidx.core.app.ActivityCompat
import com.google.mlkit.vision.barcode.Barcode
import com.google.mlkit.vision.barcode.BarcodeScannerOptions
import com.google.mlkit.vision.barcode.BarcodeScanning
import com.google.mlkit.vision.common.InputImage


class BarcodeScanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barcode_scan)




//        val image = InputImage.fromBitmap(bitmap, 0)
//
//        val result = scanner.process(image)
//            .addOnSuccessListener { barcodes ->
//                // Task completed successfully
//                // ...
//            }
//            .addOnFailureListener {
//                // Task failed with an exception
//                // ...
//            }
    }

//    private fun openCamera() {
//        val manager = getSystemService(Context.CAMERA_SERVICE) as CameraManager
//
//        val cameraId = manager.cameraIdList[0]
//        val characteristics = manager.getCameraCharacteristics(cameraId)
//        val map = characteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)
//        characteristics.get(CameraCharacteristics.LENS_FACING)
//
//        val imageDimension = map!!.getOutputSizes(SurfaceTexture::class.java)[0]
//        if (ActivityCompat.checkSelfPermission(
//                this,
//                Manifest.permission.CAMERA
//            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
//                this,
//                Manifest.permission.WRITE_EXTERNAL_STORAGE
//            ) != PackageManager.PERMISSION_GRANTED
//        ) {
//            ActivityCompat.requestPermissions(
//                this,
//                arrayOf(Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE),
//                REQUEST_CAMERA_PERMISSION
//            )
//            return
//        }
//        manager.openCamera(cameraId, stateCallback, null)
//
//
//    }

    private class YourImageAnalyzer : ImageAnalysis.Analyzer {

        @SuppressLint("UnsafeExperimentalUsageError")
        override fun analyze(imageProxy: ImageProxy) {
            val mediaImage = imageProxy.image

            if (mediaImage != null) {
                val image =
                    InputImage.fromMediaImage(mediaImage, imageProxy.imageInfo.rotationDegrees)
                // Pass image to an ML Kit Vision API
                // ...
            }
        }
    }
}