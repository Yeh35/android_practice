package com.yeh35.practice.android.testing.unit

import android.content.Context
import android.util.AttributeSet
import android.view.View

class SimpleView: View {

    constructor(context: Context): super(context)
    constructor(context: Context, attrs: AttributeSet): super(context, attrs)

    var text = ""
}