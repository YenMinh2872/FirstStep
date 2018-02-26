package empire.stark.firststep.extensions

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.view.View

/**
 * Created by YENMINH on 2/3/2018 3:54 PM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 *
 */
/**
 * replace fragment no add to back-stack
 *@fragment : fragment to replace (compat fragment)
 *@containerId: id of frame container
 */
fun AppCompatActivity.replaceFragment(fragment: Fragment, containerId: Int) {
    supportFragmentManager.transact { replace(containerId, fragment) }
}

/**
 * replace fragment and add to back-stack with tag name
 *@fragment : fragment to replace (compat fragment)
 *@containerId: id of frame container
 *@tag : name tag will be add to back-stack
 */
fun AppCompatActivity.replaceFragment(fragment: Fragment, containerId: Int, tag: String) {
    supportFragmentManager.transact { replace(containerId, fragment, tag) }
}

/*fun AppCompatActivity.replaceFragmentAnim(fragment: Fragment, containerId: Int, sharedElementView: View, nameSharedElement: String) {
    supportFragmentManager.transact { replace(containerId, fragment).addSharedElement(sharedElementView, nameSharedElement) }
}*/

/**
 * Runs a FragmentTransaction, then calls commit().
 */
private inline fun FragmentManager.transact(action: FragmentTransaction.() -> Unit) {
    beginTransaction().apply { action() }.commit()
}