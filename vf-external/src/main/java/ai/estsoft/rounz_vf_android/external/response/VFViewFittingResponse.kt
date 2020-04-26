package ai.estsoft.rounz_vf_android.external.response

sealed class VFViewFittingResponse {
    object NotSupportedWebGL : VFViewFittingResponse()
    object ConfigResourceLoadFailure : VFViewFittingResponse()
    object ProfileResourceLoadFailure : VFViewFittingResponse()
    object ProductResourceLoadFailure : VFViewFittingResponse()
    object NotSupportedColorLensProfile : VFViewFittingResponse()

    object UnknownError : VFViewFittingResponse()
}