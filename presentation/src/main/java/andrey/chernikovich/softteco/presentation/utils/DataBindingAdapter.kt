package andrey.chernikovich.softteco.presentation.utils

import android.databinding.BindingAdapter
import android.view.View

@BindingAdapter("visibility")
fun View.visibility(visibility: Boolean) {
    this.visibility = if (visibility) View.VISIBLE else View.INVISIBLE
}