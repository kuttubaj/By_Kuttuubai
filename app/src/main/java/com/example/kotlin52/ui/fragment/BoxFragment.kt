import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.kotlin52.R
import com.example.kotlin52.databinding.FragmentBoxBinding

class BoxFragment : Fragment() {
    private var _binding: FragmentBoxBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBoxBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        binding.addButton.setOnClickListener {
            binding.progressBar.isVisible = true
            Handler().postDelayed(
                {
                    binding.progressBar.isVisible = false
                    findNavController().navigate(R.id.action_boxFragment_to_addItemFragment)
                },
                5000
            )
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
