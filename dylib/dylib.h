#ifndef _DYLIB_API_H_
#define _DYLIB_API_H_

#ifdef _WIN32
  #define DYLIB_API __declspec(dllexport) 
#else
  #define DYLIB_API 
#endif

#define     HANDLE void *

#define		BYTE unsigned char
#define		ULONG unsigned int

#define MAX_IV_LEN			32		//初始化向量的最大长度

#pragma pack(1)
/*
 *分组密码参数
 */
typedef struct Struct_BLOCKCIPHERPARAM{
	BYTE	IV[MAX_IV_LEN];			
	ULONG	IVLen;					
	ULONG	PaddingType;			
	ULONG	FeedBitLen;				
} BLOCKCIPHERPARAM, *PBLOCKCIPHERPARAM;

#pragma pack()

#ifdef __cplusplus
extern "C" {
#endif

ULONG DYLIB_API test_init (HANDLE hKey, BLOCKCIPHERPARAM param);

#ifdef __cplusplus
}
#endif

#endif // _DYLIB_API_H_