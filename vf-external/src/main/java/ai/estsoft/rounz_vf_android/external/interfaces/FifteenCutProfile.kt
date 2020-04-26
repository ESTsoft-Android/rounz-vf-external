package ai.estsoft.rounz_vf_android.external.interfaces

import ai.estsoft.rounz_vf_android.external.model.FaceSize
import ai.estsoft.rounz_vf_android.external.model.Gender
import ai.estsoft.rounz_vf_android.external.response.CreateFaceInfoResponse
import ai.estsoft.rounz_vf_android.external.response.CreateProfileResponse

interface FifteenCutProfile : FaceRecognizeRender {

    /**
     * 프로필 녹화 후 생성되는 이미지 파일의 인덱스 범위입니다.
     */
    val profileRange: IntRange

    /**
     * [FaceRecognizeListener] 바인딩하며,
     * 모듈 내에서 촬영을 위해 초기화 합니다.
     * 촬영 준비가 모두 완료되면, 호출하도록 합니다.
     *
     * @param listener 얼굴을 인식하는 동작의 콜백을 받기 위한 리스너
     */
    fun bind(listener: FaceRecognizeListener)

    /**
     * 촬영을 하지 않게 되면 호출하도록 합니다. (즉, 화면을 나가기 전)
     */
    fun unbind()

    /**
     * [FaceRecognizeRender.onDrawFrame] 통해 전달받은 Texture ID 를 통해 프로필 녹화가 진행됩니다.
     *
     * @param cameraId 현재 보여지고 있는 카메라 ID
     */
    fun startShooting(cameraId: String)

    /**
     * 프로필 녹화를 종료합니다.
     *
     * @param url 프로필 서버 url
     */
    fun stopShooting(url: String)

    /**
     * 비디오 프로필의 설정 파일을 생성합니다.
     *
     * 호출 시점은 반드시
     * [FifteenCutProfile.startShooting], [FifteenCutProfile.stopShooting] 이후
     * [FaceRecognizeListener.onFaceAnalyzed]에서 넘어오는
     * [CreateProfileResponse.Success] 응답을 받은 이후에 호출해야 합니다.
     *
     * @param gender 성별 정보
     * @param faceSize 얼굴 사이즈 정보
     * @return 비디오 프로필 설정 파일 생성 완료 결과
     */
    fun createFifteenCutFaceInfo(
        gender: Gender,
        faceSize: FaceSize
    ): CreateFaceInfoResponse

}