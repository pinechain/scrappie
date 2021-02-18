package keys

import com.pinechain.view.fragment.SearchByIngredientsFragment
import com.zhuinden.simplestackextensions.fragments.DefaultFragmentKey
import kotlinx.parcelize.Parcelize

@Parcelize
class SearchByIngredientsKey : DefaultFragmentKey() {
    override fun instantiateFragment() = SearchByIngredientsFragment()
}