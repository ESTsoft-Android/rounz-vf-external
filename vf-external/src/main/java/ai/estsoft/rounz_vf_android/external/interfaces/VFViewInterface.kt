package ai.estsoft.rounz_vf_android.external.interfaces

import ai.estsoft.rounz_vf_android.external.model.VFInfo
import ai.estsoft.rounz_vf_android.external.response.VFViewFittingResponse
import java.io.File

interface VFViewInterface {
    /**
     * VF를 준비합니다.
     * [VFResource.downloadVFCommonResource] 이후 정상 응답을 받은 이후에 호출되어야 합니다.
     */
    fun prepare()

    /**
     * 상품을 피팅 요청합니다.
     * [prepare] 이후에 호출되도록 합니다.
     *
     * @param vfInfo 피팅 시킬 상품 정보
     */
    fun requestFitting(vfInfo: VFInfo)

    /**
     * 현재 보여지는 피팅된 사진을 저장합니다.
     *
     * @param file 사진 저장 경로
     */
    fun requestCapture(file: File)

    interface FittingListener {
        /**
         * 피팅이 시작되었음을 알립니다.
         */
        fun onStarted()

        /**
         * 피팅이 완료되었음을 알립니다.
         */
        fun onCompleted()

        /**
         * 에러가 발생하여 피팅을 할 수 없음을 알립니다.
         *
         * @param error 피팅 응답
         */
        fun onError(error: VFViewFittingResponse)
    }

    interface CaptureListener {
        /**
         * 피팅된 사진의 저장이 성공했음을 알립니다.
         *
         * @param imagePath 사진 저장 경로
         */
        fun onCaptureSuccess(imagePath: String)

        /**
         * 피팅된 사진의 저장이 실패했음을 알립니다.
         */
        fun onCaptureFailure()
    }
}