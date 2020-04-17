package ai.estsoft.rounz_vf_android.external.response

import java.io.File

sealed class VfStoreResponse {
    class Success(val file: File): VfStoreResponse()
    class Failure(val throwable: Throwable) : VfStoreResponse()
}