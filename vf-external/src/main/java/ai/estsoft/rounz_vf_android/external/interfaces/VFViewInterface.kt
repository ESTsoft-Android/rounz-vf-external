package ai.estsoft.rounz_vf_android.external.interfaces

import ai.estsoft.rounz_vf_android.external.model.VFInfo
import ai.estsoft.rounz_vf_android.external.response.VFViewFittingResponse
import java.io.File

interface VFViewInterface {
    fun prepare()
    fun requestFitting(vfInfo: VFInfo)
    fun requestCapture(file: File)

    interface FittingListener {
        fun onStarted()
        fun onCompleted()
        fun onError(error: VFViewFittingResponse)
    }

    interface CaptureListener {
        fun onCaptureSuccess(imagePath: String)
        fun onCaptureFailure()
    }
}