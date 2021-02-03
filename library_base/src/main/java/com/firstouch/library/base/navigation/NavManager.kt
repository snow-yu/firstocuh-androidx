package com.firstouch.library.base.navigation

import androidx.navigation.NavDirections

/**
 * ===============================
 *
 * @author jiaxue
 * @date 2/2/21 4:14 PM
 * ================================
 */
class NavManager {
    private var navEventListener: ((navDirections: NavDirections) -> Unit)? = null

    fun navigate(navDirections: NavDirections) {
        navEventListener?.invoke(navDirections)
    }

    fun setOnNavEvent(navEventListener: (navDirections: NavDirections) -> Unit) {
        this.navEventListener = navEventListener
    }
}