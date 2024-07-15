package org.example;


/**
 * 11. Using hard coding property/parameter values for business logic like campaign ids, brand ids, sale price thresholds.
 */

// TestScene 1
public class HardCodeCategoryId {
    public static final Long FRESH_COMPONENT_ID = 396299L;
}

public class HighlightFreshDiscountPromotionMsgBoxHelper {

    private final FreshCouponSegmentExtractor freshCouponSegmentExtractor;

    public boolean isTarget(IndexContext indexContext, MemberDto memberDto) {
        return isFreshHome(indexContext)
                && !isFirstFreshCouponTarget(memberDto)
    }

    private boolean isFirstFreshCouponTarget(MemberDto memberDto) {
        /* ... */
    }

    private boolean isFreshHome(IndexContext indexContext) {
        return HardCodeCategoryId.FRESH_COMPONENT_ID.equals(indexContext.getComponentId()) && !indexContext.isCampaign();
    }
}

// TestScene 2
public CustomTargetPage getLinkCategoryCustomTargetPage(Long componentId) {
    CustomTargetPage defaultTargetPage = CATEGORY_PLP.getCustomTargetPage();
    if (isNull(componentId) || componentId.equals(0L)) {
        return defaultTargetPage;
    }

    DisplayComponent component = displayComponentRootProvider.getComponent(componentId);

    if (superAppChecker.isSuperApp()) {
        return superAppTargetPageResolver.getTargetPage(component);
    }

    return isNull(component) ? defaultTargetPage : getByComponent(component, defaultTargetPage);
}

// TestScene 3
public class HardCodeCampaignId {
    public static final Long CAVENUE_CAMPAIGN_ID = 8070L;
}

if (HardCodeCampaignId.CAVENUE_CAMPAIGN_ID.equals(campaignId)) {
        if (lazyLoadingPageAbTestHelper.isCAvenueLazyLoadingTarget(campaignId, componentId)) {
        return C_AVENUE_HOME_PAGE.getCustomTargetPage();
        }
        return CAVENUE_CAMPAIGN_WITH_SEARCH_BAR.getCustomTargetPage();
        }


// TestScene 4
public static final String MANAGE_CODE_KEYWORD_BOTH_OF_WOW_AND_NON_WOW = "xzcrmgrowthwq";

public boolean isContainBothOfWowAndNonWowKeywordInDownloadCouponDiscount(){
        String manageCode=PriceHelper.getManageCodeOfPriceDetailDto(getDetailPriceInfos(),PriceHelper.PriceTypeEnum.DOWNLOAD_COUPON_DISCOUNT);
        return Objects.nonNull(manageCode)&&manageCode.contains(MANAGE_CODE_KEYWORD_BOTH_OF_WOW_AND_NON_WOW);
        }

// TestScene 5
public boolean isMatch(ProductItem productItem) {
        Long brandId = productItem.getBrandId();

        if (Objects.isNull(brandId)) {
        return false;
        }

        return beautyCAvenueBrands.contains(brandId);
        }

// TestScene 6
public boolean isTarget(KeywordSearchResult keywordSearchResult, ProductSearchContext productSearchContext) {
        ...
        jikguFreeShippingCategoryIds.contains(productSearchContext.getKeyword()) &&
        ...
        }

// TestScene 7
@PostConstruct
public void init() {
        notebookQueries = loadResource("/data/laptop-keyword/laptop_related_queries.txt");
        }

public boolean isTargetQueryAndNoLog(String query) {
        //laptop keywords search suppress CE purpose tag
        //laptop keywords type, expose Bargain widget discount rate > 10% -> a query setup can be in SDW asteroid?
        return isNotebookQuery(query) && isTargetNoLog();
        }

private boolean isTargetNoLog() {
        return !ABTestClientHolder.getOptionNoLog(AOS_TEST.getKey()).isAOrNA() || !ABTestClientHolder.getOptionNoLog(IOS_TEST.getKey()).isAOrNA()
        || !ABTestClientHolder.getOptionNoLog(AbTest.PARITY_TW_EXPOSE_LAPTOP_KEYWORDS.getKey()).isAOrNA();
        }

private boolean isNotebookQuery(String query) {
        return notebookQueries.contains(QueryUtils.normalize(query));
        }

// TestScene 8
public class AntiPattern11 {

    private static final String CAMPAIGN_ID = "CAMP123"; // Hard-coded campaign ID
    private static final String BRAND_ID = "BRAND456";   // Hard-coded brand ID
    private static final double SALE_PRICE_THRESHOLD = 100.0; // Hard-coded sale price threshold

    public boolean isEligibleForDiscount(double price) {
        return price < SALE_PRICE_THRESHOLD;
    }

    // Other business logic methods...
}

// TestScene 2





