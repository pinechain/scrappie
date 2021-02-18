package keys

import android.os.Bundle
import com.pinechain.view.fragment.RecipeListFragment
import com.zhuinden.simplestackextensions.fragments.DefaultFragmentKey
import kotlinx.parcelize.Parcelize

@Parcelize
class RecipeListKey(val originFragmentConstKey: String, val originFragmentBundle: Bundle) : DefaultFragmentKey() {
    override fun instantiateFragment() = RecipeListFragment(originFragmentConstKey, originFragmentBundle)
}