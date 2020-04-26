package ai.estsoft.rounz_vf_android.external.interfaces

import ai.estsoft.rounz_vf_android.external.response.CreateProfileResponse

interface FaceRecognizeListener {
    /**
     * 얼굴이 인식된 여부를 알려주는 콜백입니다.
     *
     * 얼굴영역이 가이드라인 안으로 들어오더라도 [onFaceRecognized] 콜백이 불린 상태면,
     * [FifteenCutProfile.unbind] 호출되기 전까지
     * [isRecognized] 값이 `true` 값으로 절대 넘어오지 않습니다.
     *
     * @param isRecognized 얼굴인식 여부
     */
    fun onFaceRecognizing(isRecognized: Boolean)

    /**
     * 얼굴인식이 특정 시간동안 가이드라인 안에 있었음을 알려주는 콜백입니다.
     */
    fun onFaceRecognized()

    /**
     * 얼굴 분석을 완료되었음을 알려주는 콜백입니다.
     *
     * @param response 촬영이 완료되고, 촬영 결과에 대한 응답을 전달합니다.
     */
    fun onFaceAnalyzed(response: CreateProfileResponse)
}