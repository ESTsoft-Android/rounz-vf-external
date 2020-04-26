package ai.estsoft.rounz_vf_android.external.response

import java.io.File

sealed class VFStoreResponse {
    class Success(val file: File): VFStoreResponse()
    class Failure(val throwable: Throwable) : VFStoreResponse()
}