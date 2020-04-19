# rounz-vf-external-android

https://git.estsoft.com/deepeye/rounz-vf-android  
위의 라운즈 안드로이드 VF 모듈에서 사용하는 의존성만을 다운로드 받는 프로젝트입니다.

## Getting Started
아래 링크를 통해 레파지토리를 복사해 주세요.

```shell script
git clone https://gitlab.com/estsoft-android/rounz-vf-external.git
```

## 프로젝트 파일
### VF 모듈을 사용하기 위해 앱 쪽에서 접근하는 파일(외부 노출 파일)
앱 쪽에서 VF 모듈을 사용하기 위해, 직접적으로 접근하는 클래스들은 이 프로젝트에 정의 해두었습니다.

### 버전을 관리하기 위한 파일
버전을 관리하는 파일은 아래 3가지 파일만을 사용합니다.

- build.gradle(project)
- build.gradle(app)
- versions.gradle: 공통으로 버전정보를 관리하기 위함

## WHY?
VF 모듈에서 사용하는 의존성을 다운로드하기 위한 프로젝트입니다.  
일반적으로 안드로이드 모듈 파일을 적용하는 방법은 아래 2가지 방법이 있습니다.

### 1. AAR 모듈 파일을 수동으로 넣어주는 방식
> 모듈에서 사용하고 있는 의존성 정보들 모두 AAR 파일을 넣어줘야 합니다.  
> 만약 모듈에서 retrofit, moshi 라이브러리를 사용한다면, 이 2개의 파일만 넣어주지 않고  
> retrofit 에서 사용하는 의존성들, moshi 에서 사용하는 의존성들을 모두 준비해서 수동으로 넣어줘야 합니다.
>
> 또한 외부에서 aar 파일 안의 클래스들을 볼 경우 `.class` 파일만 볼 수 있습니다.
>
### 2. 메이븐 레파지토리에서 다운로드 받는 방식
> 위 1번 내용에서 설명된 모든 의존성 정보들을 준비해서 수동으로 넣어줄 필요 없이  
> 메이븐 레파지토리에서 가지고 있는 pom.xml 파일을 이용해서, 필요한 의존성들을 자동으로 받아오도록 합니다.
>
> 일반적으로 기존에 우리가 알고 있는 주요 라이브러리들이 사용하는 방법이며 아래와 같은 방법으로 사용합니다.
> ``` gradle
> implementation "com.squareup.retrofit2:retrofit:$retrofit_version"
> ```
>
> 하지만, 위와 같은 방법으로 사용하기 위해 bintray(jcenter), jitpack 등등 여러개의 업체가 있지만  
> 코드 공개를 요구하고 있고, private repository 는 유료형태로 운영되고 있습니다.
>
> 또한 메이븐 레파지토리를 이용할 경우, 파일은 .class 파일 뿐만 아니라  
> 소스코드를 포함시킬 수 있어서 javadoc 문서도 볼 수 있습니다.
>
### 모듈 제공 조건
> - VF 모듈은 코드 공개가 되지 않아야 한다.
> - 모듈에서 사용하는 의존성들의 의존성들을 다운받기 위한 용이함.
> - 의존성 버전 충돌로 인해 자유롭게 exclude 시킬 수 있어야 함.
> - 모듈 배포를 과금 없이 하는 방법?
> - 외부에서 직접 접근해서 쓰는 파일의 인터페이스나 클래스, javadoc 을 볼 수 있어야 함.

위의 조건들을 만족시키기 위해, 의존성만 제공하는 프로젝트로 분리

## 배포
이 프로젝트에서는 배포를 위해 jitpack 을 사용합니다.

작업이 모두 완료가 되면 버전 정보 이름으로 된 git 태그를 푸시하고,  
https://jitpack.io 를 접속해서 로그인을 합니다. (로그인은 github 계정 있으면 됨)

git repo url 입력 칸에 아래 주소를 입력하고 초록색의 'Look up' 버튼을 누릅니다.
> com.gitlab.estsoft-android/rounz-vf-external

그 후, 가장 최신의 tag version 의 초록색의 Get It 버튼을 누릅니다.  
그러면 메이븐 레파지토리에 배포가 이뤄지고, 배포가 완료되면 의존성을 받아갈 수 있게 됩니다.