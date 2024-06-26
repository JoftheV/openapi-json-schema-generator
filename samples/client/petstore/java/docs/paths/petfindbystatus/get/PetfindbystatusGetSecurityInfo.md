# PetfindbystatusGetSecurityInfo
PetfindbystatusGetSecurityInfo.java

public class PetfindbystatusGetSecurityInfo

A class that provides a security requirement object, and any needed security info classes
- a class that is a SecurityRequirementObjectProvider
- an enum class that describes security index values

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [PetfindbystatusGetSecurityInfo.PetfindbystatusGetSecurityInfo1](#petfindbystatusgetsecurityinfo1)<br>SecurityRequirementObjectProvider
| enum | [PetfindbystatusGetSecurityInfo.SecurityIndex](#securityindex)<br>class that stores a security index |

## PetfindbystatusGetSecurityInfo1
implements SecurityRequirementObjectProvider<[SecurityIndex](#securityindex)>

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbystatusGetSecurityInfo1()<br>Creates an instance |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [PetfindbystatusGetSecurityRequirementObject0](../../../paths/petfindbystatus/get/security/PetfindbystatusGetSecurityRequirementObject0.md) | security0 |
| [PetfindbystatusGetSecurityRequirementObject1](../../../paths/petfindbystatus/get/security/PetfindbystatusGetSecurityRequirementObject1.md) | security1 |
| [PetfindbystatusGetSecurityRequirementObject2](../../../paths/petfindbystatus/get/security/PetfindbystatusGetSecurityRequirementObject2.md) | security2 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| SecurityRequirementObject | getSecurityRequirementObject(@Nullable [SecurityIndex](#securityindex) securityIndex)<br>If null is input, then the instance's securityIndex will be used |

## SecurityIndex
enum SecurityIndex<br>

### Enum Constant Summary
| Enum Constant And Description |
| ----------------------------- |
| SECURITY_0<br>security 0 |
| SECURITY_1<br>security 1 |
| SECURITY_2<br>security 2 |
